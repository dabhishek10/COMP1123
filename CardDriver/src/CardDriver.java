//********************************************************************
//  CardDriver.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 8.7 
//********************************************************************

public class CardDriver
{
   //-----------------------------------------------------------------
   //  Creates a deck, shuffles the deck and deals the cards.
   //-----------------------------------------------------------------
   public static void main (String args[])
   {
      DeckOfCards deck = new DeckOfCards();
      int cardNumber = 1;

      deck.shuffle();

      while (deck.hasMoreCards())
      {
         System.out.println(cardNumber + ": " + deck.deal());
         cardNumber++;
      }
   }
}
