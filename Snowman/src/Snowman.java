//********************************************************************
//  Snowman.java       Author: Luxing Huang (100113287)
//
//  Demonstrates basic drawing methods and the use of color.
//********************************************************************

import java.applet.Applet;
import java.awt.*;
import javax.swing.*;

public class Snowman extends Applet
{
   //-------------------------------------
   //  Assignment 3 | Question pp 2.14
   //
   //  Draws a snowman.
   //-------------------------------------
   public void paint (Graphics page)
   {
      final int MID = 150;
      final int TOP = 50;

      setBackground(Color.cyan);

      page.setColor(Color.blue);
      page.fillRect(0, 175, 300, 50);  // ground

      page.setColor(Color.yellow);
      page.fillOval(360, -40, 80, 80);  // sun

      page.setColor(Color.white);
      page.fillOval(MID, TOP, 40, 40);      // head
      page.fillOval(MID-15, TOP+35, 70, 50);   // upper torso
      page.fillOval(MID-30, TOP+80, 100, 60);  // lower torso

      // Add two red buttons to the upper torso, initiate two buttons.
      Button button = new Button("·");
      Button buttonTwo = new Button("·");

      // Settings for Button 1
      button.setBackground(Color.red);
      button.setSize(15,15);
      button.setVisible(true);
      button.setLocation(175,100);
      this.add(button); // Add Button 1
      
      // Settings for Button 2
      buttonTwo.setBackground(Color.red);
      buttonTwo.setSize(15,15);
      buttonTwo.setVisible(true);
      buttonTwo.setLocation(150,100);
      this.add(buttonTwo);  // Add Button 2
      
      //Display my name in the upper left corner.
      page.setColor(Color.red);
      page.drawString("Luxing Huang", 0, 10);
      
      page.setColor(Color.black);
      page.fillOval(MID+10, TOP+10, 5, 5);   // left eye
      page.fillOval(MID+25, TOP+10, 5, 5);    // right eye
      page.drawArc (MID+10, TOP+25, 20, 10, 10, 160);   // frown

      page.drawLine(MID-5, TOP+60, MID-30, TOP+40);  // left arm
      page.drawLine(MID+25, TOP+60, MID+75, TOP+60);  // right arm

      page.drawLine(MID, TOP+5, MID+20, TOP+5);  // brim of hat
      page.fillRect(MID+5, TOP-20, 30, 25);        // top of hat
   }
}
