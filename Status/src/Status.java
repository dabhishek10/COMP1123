//********************************************************************
//  Status.java       Author: Luxing Huang (100113287)
//
//  Show message once has any changes.
//********************************************************************
import javax.swing.JFrame;
public class Status
{
   //--------------------------------------
   // Assignment 7
   //
   // Use of Actionlistener and getSource.
   //--------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Status");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      StatusPanel panel = new StatusPanel();
      frame.getContentPane().add(panel);
      
      frame.pack();
      frame.setVisible(true);
   }
}

