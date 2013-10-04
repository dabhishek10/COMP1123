//********************************************************************
//  ReboundPanel2.java       Author: Luxing Huang/100113287
//
//  Represents the primary panel for the Rebound2 program.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel2 extends JPanel
{
   private int WIDTH = 300, HEIGHT = 100;
   private int DELAY = 20, IMAGE_SIZE = 35;
   private Timer timer;

   private ImageIcon image;
   private int x, y, moveX, moveY;

   //-----------------------------------------------------------------
   //  Sets up the panel, including the for the animation.
   //-----------------------------------------------------------------
   public ReboundPanel2()
   {
      timer = new Timer(DELAY, new ReboundListener());

      image = new ImageIcon ("happyFace.gif");

      x = 0;
      y = 40;
      moveX = moveY = 3;

      setPreferredSize (new Dimension(WIDTH, HEIGHT));
      setBackground (Color.black);
      timer.start();
      addMouseListener(new ClickListener());
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      if (x >= super.getWidth()-IMAGE_SIZE)
      {
         if (y >= super.getWidth()-IMAGE_SIZE)
         {
            x = super.getWidth()-IMAGE_SIZE;
            y = super.getHeight()-IMAGE_SIZE;
            repaint();
         }
         else
         {
            x = super.getWidth()-IMAGE_SIZE;
            repaint();
         }
      }
      else if (x < 0)
      {
         x = 0;
         repaint();
      }
      else if (y >= super.getHeight()-IMAGE_SIZE)
      {
         if (x >= super.getWidth()-IMAGE_SIZE)
         {
            x = super.getWidth()-IMAGE_SIZE;
            y = super.getHeight()-IMAGE_SIZE;
            repaint();
         }
         else
         {
            y = super.getHeight()-IMAGE_SIZE;
            repaint();
         }
      }
      else if (y < 0)
      {
         y = 0;
         repaint();
      }
      image.paintIcon (this, page, x, y);
   }

   //*****************************************************************
   //  Represents the action listener for the timer.
   //*****************************************************************
   private class ReboundListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         x += moveX;
         y += moveY;

         if (x <= 0 ||  x >= getWidth()-IMAGE_SIZE)
         moveX = moveX * -1;

         if (y <= 0 || y >= getHeight()-IMAGE_SIZE)
         moveY = moveY * -1;

         repaint();
      }
   }

   //*****************************************************************
   //  Represents the action listener for the Click.
   //*****************************************************************
   private class ClickListener extends MouseAdapter
   {
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever clicked an action event.
      //--------------------------------------------------------------
      public void mouseClicked(MouseEvent e)
      {
         if (timer.isRunning())
            timer.stop();
         else
            timer.start();
      }
   }
}
