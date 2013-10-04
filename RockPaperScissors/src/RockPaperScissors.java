//********************************************************************
//  RockPaperScissors.java       Author: Luxing Huang (100113287)
//
//  Classical Rock Paper Scissors game.
//********************************************************************
import java.util.*;
public class RockPaperScissors
{
   //-----------------------------------
   // Assignment 6
   //
   // Use if statements to compare.
   //-----------------------------------
   public static void main(String[] args)
   {
      // Setting up variables
      int humanChoice, pcChoice;
      Random rand = new Random(); 
      Scanner scan = new Scanner(System.in);
      
      // PC generate a number first among 1, 2, 3.
      pcChoice = rand.nextInt(3)+1;
      
      // Letting player choose what (s)he wants.
      System.out.print("Please select your shape, ");
      System.out.println("1 - Rock, 2 - Paper, 3 - Scissors");
      System.out.println("Input 0 to quit.");
      humanChoice = scan.nextInt();
      // Determine input validity
      if ( humanChoice < 0 || humanChoice >3 )
      {
         System.out.println("Please enter a valid number.\n");
         System.out.print("Please select your shape, ");
         System.out.println("1 - Rock, 2 - Paper, 3 - Scissors");
         System.out.println("Input 0 to quit.");
         humanChoice = scan.nextInt();
      }
      else if ( humanChoice == 0 )
      {
         System.exit(0);
      }

      // Comparison.
      while ( humanChoice != 0 )
      {
         if ( pcChoice == 1 && humanChoice == 1 )
         {
            System.out.println("PC - Rock, You - Rock. DRAW\n");
         }
         else if ( pcChoice == 1 && humanChoice == 2 )
         {
            System.out.println("PC - Rock, You - Paper. YOU WIN\n");
         }
         else if ( pcChoice == 1 && humanChoice == 3 )
         {
            System.out.println("PC - Rock, You - Scissor. YOU LOSE\n");
         }
         else if ( pcChoice == 2 && humanChoice == 1 )
         {
            System.out.println("PC - Paper, You - Rock. YOU LOSE\n");
         }
         else if ( pcChoice == 2 && humanChoice == 2 )
         {
            System.out.println("PC - Paper, You - Paper. DRAW\n");
         }
         else if ( pcChoice == 2 && humanChoice == 3 )
         {
            System.out.println("PC - Paper, You - Scissors. YOU WIN\n");
         }
         else if ( pcChoice == 3 && humanChoice == 1 )
         {
            System.out.println("PC - Scissors, You - Rock. YOU WIN\n");
         }
         else if ( pcChoice == 3 && humanChoice == 2 )
         {
            System.out.println("PC - Scissors, You - Paper. YOU lOSE\n");
         }
         else if ( pcChoice == 3 && humanChoice == 3 )
         { 
            System.out.println("PC - Scissors, You - Scissors. DRAW\n");
         }
         pcChoice = rand.nextInt(3)+1;
         System.out.print("Please select your shape, ");
         System.out.println("1 - Rock, 2 - Paper, 3 - Scissors");
         System.out.println("Input 0 to quit.");
         humanChoice = scan.nextInt();
      }
      System.exit(0);
   }
}

