//********************************************************************
//  PairOfDice.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.8
//********************************************************************

public class PairOfDice
{
   private Die die1, die2;

   //-----------------------------------------------------------------
   //  Creates two six-sided Die objects, both with an initial
   //  face value of one.
   //-----------------------------------------------------------------
   public PairOfDice()
   {
      die1 = new Die();
      die2 = new Die();
   }

   //-----------------------------------------------------------------
   //  Rolls both dice and returns the combined result.
   //-----------------------------------------------------------------
   public int roll()
   {
      return die1.roll() + die2.roll();
   }
   
   //-----------------------------------------------------------------
   //  First die value mutator.
   //-----------------------------------------------------------------
   public void setDie1FaceValue (int value)
   {
      die1.setFaceValue(value);
   }
   
   //-----------------------------------------------------------------
   //  Second die value mutator.
   //-----------------------------------------------------------------
   public void setDie2FaceValue (int value)
   {
      die2.setFaceValue(value);
   }

   //-----------------------------------------------------------------
   //  Returns the current combined dice total.
   //-----------------------------------------------------------------
   public int getTotalFaceValue()
   {
      return die1.getFaceValue() + die2.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the first die.
   //-----------------------------------------------------------------
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Returns the current value of the second die.
   //-----------------------------------------------------------------
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }

   //-----------------------------------------------------------------
   //  Returns the string representation of this pair of dice.
   //-----------------------------------------------------------------
   public String toString()
   {
      return "Die 1: " + die1 + "   Die 2: " + die2;
   }
}
