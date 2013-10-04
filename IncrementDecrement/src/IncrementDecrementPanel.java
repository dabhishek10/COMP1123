//********************************************************************
//  IncrementDecrement.java       Author: Luxing Huang (100113287)
//
//  Click button to increase / decrease numbers.
//********************************************************************

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IncrementDecrementPanel extends JPanel
{
   private JLabel outputLabel;
   private JTextField text;
   private final int INIT_NUM = 50;
   
   private int number = INIT_NUM;
	//---------------------------------------
	// Assignment 4
	//
	// This is the panel itself.
	//---------------------------------------
   public IncrementDecrementPanel()
   {
      setPreferredSize(new Dimension(300,75));
      setBackground(Color.yellow);

      outputLabel = new JLabel("" + number);
      JButton increment = new JButton("Increment");
      increment.addActionListener(new IncreListener());

      JButton decrement = new JButton("Decrement");
      decrement.addActionListener(new DecreListener());

      add(increment);
      add(outputLabel);
      add(decrement);
   }
   private class IncreListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         number++;
         outputLabel.setText(Integer.toString(number));
      }
   }
   private class DecreListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         number--;
         outputLabel.setText(Integer.toString(number));
      }
   }
}

