//********************************************************************
//  LeapYear.java       Author: Luxing Huang (100113287)
//
//  Determine whether the input is a leap year or not.
//********************************************************************
import java.util.*;

public class LeapYear
{
   private static int YEAR_UNTIL = 1582;
   //----------------------------------------------
   // Assignment 6
   //
   // Use While and Boolean to determine leap year.
   //----------------------------------------------
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.println("Please enter your year number...");
      int input = scan.nextInt();

      while (input != 0)
      {
         if (input < YEAR_UNTIL)
         {
            System.out.println("Please enter a valid year larger than 1582\n");
         }
         else
         {
            if (input % 400 == 0 || ( input % 4 == 0 && input % 100 != 0 ))
            {
               System.out.println(input + " is a leap year.\n");
            }
            else
            {
               System.out.println(input + " is not a leap year.\n"); 
            }
         }
         System.out.print("Please enter your year number. ");
         System.out.println("Enter 0 to quit");
         input = scan.nextInt();
      }
   }
}

