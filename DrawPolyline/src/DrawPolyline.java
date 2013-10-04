//********************************************************************
//  DrawPolyline.java       Author: Luxing Huang (100113287)
//
//  Drive the DrawPolylinePanel.
//********************************************************************
import javax.swing.JFrame;
public class DrawPolyline
{
   //-----------------------------------
   // Assignment 10
   //
   // Frame work.
   //-----------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new DrawPolylinePanel());
      frame.pack();
      frame.setVisible(true);
   }
}

