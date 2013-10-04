//********************************************************************
//  Seconds.java       Author: Luxing Huang (100113287)
//
//  Calculate the input into seconds.
//********************************************************************

import java.util.Scanner;

public class Seconds
{
   //-----------------------------------
   // Assignment 2 / Question pp 2.8 
   //
   // Calculate the input into seconds.
   //-----------------------------------
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int hoursInt;
      System.out.println("How many hours?");
      hoursInt = scan.nextInt();

      int minutesInt;
      System.out.println("How many minutes?");
      minutesInt = scan.nextInt();

      int secondsInt;
      System.out.println("How many seconds?");
      secondsInt = scan.nextInt();
      
      scan.close();

      int total;
      total = hoursInt * 3600 + minutesInt * 60 + secondsInt;

      System.out.println("The total time in seconds is: " + total + ".");
   }
}

