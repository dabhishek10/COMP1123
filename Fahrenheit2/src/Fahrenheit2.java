//********************************************************************
//  Fahrenheit.java       Author: Luxing Huang (100113287)
//
//  Demonstrates the use of text fields.
//********************************************************************

import javax.swing.JFrame;

public class Fahrenheit2
{
   //-----------------------------------------------------------------
   //  Creates and displays the temperature converter GUI.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Fahrenheit");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      FahrenheitPanel2 panel = new FahrenheitPanel2();

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}
