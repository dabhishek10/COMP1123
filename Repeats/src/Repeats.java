//********************************************************************
//  Repeats.java       Author: Luxing Huang (100113287)
//
//  Ask user to generate number and let the machine guess till right.
//********************************************************************
import java.util.*;

public class Repeats
{
   //----------------------------------------------
   // Assignment 6
   //
   // Use Arraylist to determine number existance.
   //----------------------------------------------

   public static void main(String[] args)
   {
      /* Initialising the objects */
      final int MAX_NUMBER = 150;
      int count = 1;
      int repCount = 0;
      int input, guess;
      boolean check;
      Scanner scan = new Scanner(System.in);
      Random rand = new Random();
      ArrayList<Integer> array = new ArrayList<Integer>();

      /* Ask the user the number input */
      System.out.println("Please enter an integer between 1-150:");
      input = scan.nextInt();
      
      /* Generate the initial data */
      guess = rand.nextInt(MAX_NUMBER) + 1;

      System.out.println("Numbers that were generated more than once: \n");

      /* Now do the comparison */
      while ( guess != input )
      {
         guess = rand.nextInt(MAX_NUMBER) + 1;
         count = count + 1;
         boolean b = array.contains(guess);
         
         /* Use Boolean to justify */
         if ( b == true )
         {
            System.out.println("" + guess);
            repCount = repCount + 1;
         }
         else 
         {
            array.add(guess);
         }
      }

      System.out.println("\nRandomly generated " + count + 
                         " numbers before the integer " + input + 
                         " was generated. \n");
      System.out.println( (count-repCount) + 
                           " unique number were generated.");
   }
}

