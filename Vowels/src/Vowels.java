//********************************************************************
//  Vowels.java       Author: Luxing Huang (100113287)
//
//  Counts Vowel number and non-vowel number in a string.
//********************************************************************
import java.util.Scanner;

public class Vowels
{
   //----------------------------------------
   // Assignment 8
   //
   // Use switch statement to count vowels.
   //----------------------------------------
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a string");
      String input = scan.nextLine();
      int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, 
          nonVowel = 0;

      for (int count = 0; count < input.length(); count++)
      {
         char letter = input.charAt(count);
         switch ( letter )
         {
            case 'a':
            aCount++;
            break;

            case 'e':
            eCount++;
            break;

            case 'i':
            iCount++;
            break;

            case 'o':
            oCount++;
            break;

            case 'u':
            uCount++;
            break;

            case ' ':
            break;

            default:
            nonVowel++;
         }
      }
      System.out.println("There are: " + aCount + " a's, \t" + eCount 
                         + " e's, \t " + iCount + " i's, \t" + oCount 
                         + " o's, \t" + uCount + " u's.");
      System.out.println("There are " + nonVowel + " non-vowel letters.");
   }
}

