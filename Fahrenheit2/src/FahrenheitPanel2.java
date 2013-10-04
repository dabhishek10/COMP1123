//********************************************************************
//  FahrenheitPanel.java       Author: Luxing Huang (100113287)
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel2 extends JPanel
{
   private JLabel inputLabel, outputLabel, resultLabel;
   private JTextField fahrenheit;


   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   public FahrenheitPanel2()
   {
      inputLabel = new JLabel ("Enter Fahrenheit temperature:");
      outputLabel = new JLabel ("Temperature in Celsius: ");
      resultLabel = new JLabel ("---");
      
      TempListener temp = new TempListener();

      JButton button = new JButton("Convert");
      button.setSize(50,30);
      button.setVisible(true);
      button.addActionListener(temp);
      
      fahrenheit = new JTextField(5);
      fahrenheit.addActionListener(temp);

      add (inputLabel);
      add (fahrenheit);
      add (outputLabel);
      add (resultLabel);
      add (button);

      setPreferredSize (new Dimension(300, 75));
      setBackground (Color.yellow);
   }

   //*****************************************************************
   //  Represents an action listener for the temperature input field.
   //*****************************************************************
   private class TempListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Performs the conversion when the enter key is pressed in
      //  the text field.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         int fahrenheitTemp, celsiusTemp;

         String text = fahrenheit.getText();

         fahrenheitTemp = Integer.parseInt (text);
         celsiusTemp = (fahrenheitTemp-32) * 5/9;

         resultLabel.setText (Integer.toString (celsiusTemp));
      }
   }
}
