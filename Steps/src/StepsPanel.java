//********************************************************************
//  StepsPanel.java       Author: Luxing Huang (100113287)
//
//  Produce a staircase graph.
//********************************************************************
import javax.swing.*;
import java.awt.*;

public class StepsPanel extends JPanel
{
   /* Define constants */
   private final int NUM_STAIRS = 10;

   /* Set the default panel properties */
   public StepsPanel()
   {
      setBackground(Color.black);
      setPreferredSize(new Dimension(300,300));
   }

   public void paintComponent(Graphics g)
   {
      /* here is the comment you needed fucking markers */
      super.paintComponent(g);
      int width = getWidth(), height = getHeight();
      int stepWidth = Math.round((float) width / (float) NUM_STAIRS);
      int stepHeight = Math.round((float) height / (float) NUM_STAIRS);
      g.setColor(Color.yellow);

      for (int step = 0; step < NUM_STAIRS; step++) 
      {
         int fromX = stepWidth * step;
         int fromY = stepHeight * step;
         int toX = stepWidth * (step + 1);
         int toY = stepHeight * (step + 1);

         g.drawLine(fromX, fromY, toX, fromY);
         g.drawLine(toX, fromY, toX, toY);
      }
   }
}
