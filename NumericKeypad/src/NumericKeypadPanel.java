//********************************************************************
//  NumericKeypadPanel.java       Author: Luxing Huang (100113287)
//
//  Phone keypad and action listeners.
//********************************************************************

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*;

public class NumericKeypadPanel extends JPanel
{
   /* Here is the main panel of everything */
   private JTextField outputField;
   private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bs, bh, clear;
   private Component empty;
   public NumericKeypadPanel()
   {
      /* 
       * There will be 2 BoxLayout managers, vertical and horizontal one.
       * Horizontal one will stick itself to the bottom of the vertical one.
       * Bottom left goes the key pads, and on the right there is a clear 
       * button.
       *
       * The key pads will be position-fixed by gridlayer (4x3) with * and #
       * and 0 keys available.
       */
      ButtonListener listenNumber = new ButtonListener();
      setPreferredSize(new Dimension(200,150));
      setBackground(Color.yellow);
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

      /* we first setup the label, place it at the very top of the panel
       * The layout is controlled in a panel.
       */
      JPanel outputPanel = new JPanel();
      outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.X_AXIS));
      outputPanel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
      outputField = new JTextField(10);
      outputField.setBorder(BorderFactory.createLineBorder(Color.red, 3));

      /* setting up the first subpanel, 
       * bottomHalf.and clear button is included
       */
      JPanel bottomHalf = new JPanel();
      bottomHalf.setBackground(Color.yellow);
      bottomHalf.setLayout(new BoxLayout(bottomHalf, BoxLayout.X_AXIS));
      
      /* bottomHalf.panel, using grid layout */
      JPanel keypad= new JPanel();
      keypad.setLayout(new GridLayout(4,3));
      keypad.setSize(new Dimension(50,70));
      b1 = new JButton("1");
      b1.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b1.addActionListener(listenNumber);
      b2 = new JButton("2");
      b2.addActionListener(listenNumber);
      b2.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b3 = new JButton("3");
      b3.addActionListener(listenNumber);
      b3.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b4 = new JButton("4");
      b4.addActionListener(listenNumber);
      b4.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b5 = new JButton("5");
      b5.addActionListener(listenNumber);
      b5.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b6 = new JButton("6");
      b6.addActionListener(listenNumber);
      b6.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b7 = new JButton("7");
      b7.addActionListener(listenNumber);
      b7.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b8 = new JButton("8");
      b8.addActionListener(listenNumber);
      b8.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b9 = new JButton("9");
      b9.addActionListener(listenNumber);
      b9.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      b0 = new JButton("0");
      b0.addActionListener(listenNumber);
      b0.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      bh = new JButton("#");
      bh.addActionListener(listenNumber);
      bh.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      bs = new JButton("*");
      bs.addActionListener(listenNumber);
      bs.setBorder(BorderFactory.createLineBorder(Color.gray, 3));
      keypad.add(b1);
      keypad.add(b2);
      keypad.add(b3);
      keypad.add(b4);
      keypad.add(b5);
      keypad.add(b6);
      keypad.add(b7);
      keypad.add(b8);
      keypad.add(b9);
      /* the final line should be like * 0 # */
      keypad.add(bs);
      keypad.add(b0);
      keypad.add(bh);

      clear = new JButton("Clear");
      clear.addActionListener(new ClearListener());

      /* now adding the elements in a set of nested panels */
      outputPanel.add(outputField);
      bottomHalf.add(keypad);
      bottomHalf.add(clear);
      add(outputPanel, BorderLayout.NORTH);
      add(bottomHalf);
   }
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         String previousText = outputField.getText();
         Object source = event.getSource();
         if (source == b0)
            outputField.setText(previousText + "0");
         else if (source == b1)
            outputField.setText(previousText + "1");
         else if (source == b2)
            outputField.setText(previousText + "2");
         else if (source == b3)
            outputField.setText(previousText + "3");
         else if (source == b4)
            outputField.setText(previousText + "4");
         else if (source == b5)
            outputField.setText(previousText + "5");
         else if (source == b6)
            outputField.setText(previousText + "6");
         else if (source == b7)
            outputField.setText(previousText + "7");
         else if (source == b8)
            outputField.setText(previousText + "8");
         else if (source == b9)
            outputField.setText(previousText + "9");
         else if (source == bs)
            outputField.setText(previousText + "*");
         else 
            outputField.setText(previousText + "#");
         
      }
   }
   private class ClearListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         outputField.setText("");
      }
   }
   
}

