//********************************************************************
//  StatusPanel.java       Author: Luxing Huang (100113287)
//
//  Content for the GUI
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StatusPanel extends JPanel
{
   /* Setting up variables */
   private JLabel text, textFieldLabel;
   private JTextField input;
   private JRadioButton radio1, radio2;
   private JCheckBox check;
   private JButton button;

   public StatusPanel()
   {
      Listener action = new Listener();

      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      setBackground(Color.green);
      setPreferredSize(new Dimension(130,200));

      text = new JLabel("Radio 1 is on");
      add(text);

      radio1 = new JRadioButton("Radio 1", true);
      radio1.setBackground(Color.green);
      radio1.addActionListener(action);
      radio2 = new JRadioButton("Radio 2");
      radio2.setBackground(Color.green);
      radio2.addActionListener(action);
      ButtonGroup group = new ButtonGroup();
      group.add(radio1);
      group.add(radio2);
      add(radio1);
      add(radio2);

      /* Creating a subpanel */
      JPanel subPanel = new JPanel();
      subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.X_AXIS));
      subPanel.setBackground(Color.green);
      subPanel.setPreferredSize(new Dimension(130,0));
      textFieldLabel = new JLabel("Text Field");
      subPanel.add(textFieldLabel);
      subPanel.add(Box.createRigidArea(new Dimension(10,0)));
      input = new JTextField(5);
      input.addActionListener(action);
      subPanel.add(input);
      subPanel.add(Box.createRigidArea(new Dimension(10,0)));
      add(subPanel);
      
      /* Back to the main panel */
      button = new JButton("Button 1");
      button.addActionListener(action);
      add(button);
      
      check = new JCheckBox("Check box");
      check.setBackground(Color.green);
      check.addItemListener(new CheckListener());
      add(check);
   }

   /* This is the listener part. */
   private class Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         Object source = event.getSource();
         if (source == radio1)
            text.setText("Radio 1 is on");
         if (source == radio2)
            text.setText("Radio 2 clicked");
         if (source == input)
            text.setText("Text field used");
         if (source == button)
            text.setText("Button pushed");
      }
   }
   private class CheckListener implements ItemListener
   {
      public void itemStateChanged(ItemEvent event)
      {
         if (check.isSelected())
            text.setText("Check box on");
         else
            text.setText("Check box off");
      }
   }
}
