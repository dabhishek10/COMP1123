//********************************************************************
//  Steps.java       Author: Luxing Huang (100113287)
//
//  Driver class for the StepsPanel
//********************************************************************
import javax.swing.*;

public class Steps
{
   //-----------------------------------
   // Assignment 8
   //
   // Driver class for the panel.
   //-----------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Steps");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      StepsPanel panel = new StepsPanel();

      frame.getContentPane().add(panel);
      frame.pack();
      frame.setVisible(true);
   }
}

