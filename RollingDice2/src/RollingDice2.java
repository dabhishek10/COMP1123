//********************************************************************
//  RollingDice2.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.8
//********************************************************************

public class RollingDice2
{
   //-----------------------------------------------------------------
   //  Creates and exercises a PairOfDice object.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      PairOfDice dice = new PairOfDice();

      System.out.println (dice);

      dice.roll();

      System.out.println (dice);
      System.out.println ("Total: " + dice.getTotalFaceValue());

      dice.roll();

      System.out.println (dice);
      
      dice.setDie1FaceValue (6);
      
      System.out.println (dice);
   }
}
