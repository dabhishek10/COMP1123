//********************************************************************
//  DrawPolylinePanel.java       Author: Luxing Huang (100113287)
//
//  Draw polylines when mouse clicked.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawPolylinePanel extends JPanel
{
   private int[] xs; 
   private int[] ys;
   private Point current;
   private int count = 0;
   private final int MAX_COUNT = 100;
   /* Constructor of the components, background settings etc.*/
   public DrawPolylinePanel()
   {
      setPreferredSize(new Dimension(300,300));
      setBackground(Color.black);
      xs = new int[MAX_COUNT];
      ys = new int[MAX_COUNT];

      JButton clear = new JButton("Clear");
      clear.addActionListener(new ClearButton());
      add(clear);
      addMouseListener(new ClickListener());
   }
   
   /* What needs to be painted */
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.white);
      if (current != null)
      {
         g.drawPolyline(xs, ys, count);
      }
   }

   /* Mouse listener. */
   private class ClickListener extends MouseAdapter
   {
      public void mouseClicked(MouseEvent event)
      {
         current = event.getPoint();
         xs[count] = current.x;
         ys[count] = current.y;
         count++;
         repaint();
      }
   }

   /* Button Listener. */ 
   private class ClearButton implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
         count = 0;
         repaint();
      }
   }
}
