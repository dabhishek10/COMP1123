//********************************************************************
//  NumericKeypad.java       Author: Luxing Huang (100113287)
//
//  Driver class for NumericKeypadPanel
//********************************************************************

import javax.swing.JFrame;

public class NumericKeypad
{
	//---------------------------------------
	// Assignment 9
	//
	// Controls the NumericKeypadPanel.
	//---------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("IncrementDecrement");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      NumericKeypadPanel panel = new NumericKeypadPanel();
      
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}

