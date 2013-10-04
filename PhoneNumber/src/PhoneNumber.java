//********************************************************************
//  PhoneNumber.java       Author: Luxing Huang (100113287)
//
//  Prints out XXX-XXX-XXXX form of telephone number.
//********************************************************************


import java.text.DecimalFormat;
import java.util.Random;

public class PhoneNumber
{
   //-----------------------------------
   // Assignment 3 / Question pp 3.3 
   //
   // Create 3 sets of numbers.
   //-----------------------------------
   public static void main(String[] args)
   {
      Random random = new Random();
      int setOne, setTwo, setThree;
      
      /* At the hundreds position, generate a number larger than 0 but 
       * smaller than 8. Tenth position, generate a number smaller than 8.
       * Same with last digit.
       */
      
      setOne = (random.nextInt(7) + 1) * 100 + (random.nextInt(8) * 10) + 
               random.nextInt(8);
      setTwo = random.nextInt(743);
      setThree = random.nextInt(10000);

      DecimalFormat formattedThree = new DecimalFormat("000");
      DecimalFormat formattedFour = new DecimalFormat("0000");

      String phoneNumber = formattedThree.format(setOne) + "-" + 
                           formattedThree.format(setTwo) + "-" + 
                           formattedFour.format(setThree);

      System.out.println(phoneNumber);
    }
}
