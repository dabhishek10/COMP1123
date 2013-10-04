//********************************************************************
//  IncrementDecrement.java       Author: Luxing Huang (100113287)
//
//  Click button to increase / decrease numbers.
//********************************************************************

import javax.swing.JFrame;

public class IncrementDecrement
{
	//---------------------------------------
	// Assignment 4
	//
	// Controls the IncrementDecrementPanel.
	//---------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("IncrementDecrement");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      IncrementDecrementPanel panel = new IncrementDecrementPanel();
      
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}

