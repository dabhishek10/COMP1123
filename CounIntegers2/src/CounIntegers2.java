//********************************************************************
//  CounIntegers2.java       Author: Luxing Huang (100113287)
//
//  Keep reading integers until outside of -25<n<25
//********************************************************************
import java.util.*;

public class CounIntegers2
{
   //------------------------------------------------------
   // Assignment 10
   //
   // use while statement to determine entry validation.
   //------------------------------------------------------
   private final int CONVERSION = 25;
   public static final int LIMIT = 50;
   public static void main(String[] args)
   {
      int count[] = new int[51];
      int n;
      Scanner scan = new Scanner(System.in);
      System.out.println("\nPlease enter your number:");
      System.out.println("Finish by pressing Ctrl+D.");
      System.out.println("Or enter a number that is out of range -25 to 25");
      while (scan.hasNext())
      {
         n = scan.nextInt() + CONVERSION;
         if (n <= LIMIT && n >= 0)
         {
            count[n]++;
         }
         else
         {
            break;
         }
      }

      System.out.println("You have entered: \n");
      for (int i=0; i<=50; i++)
      {
         if (count[i]>0)
            System.out.println(i-25 + "  " + count[i] + " times.");
      }
   }
}

