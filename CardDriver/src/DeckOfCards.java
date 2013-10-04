//********************************************************************
//  DeckOfCards.java       Author: Luxing Huang/100113287
//
//  DeckOfCards to represent 52 playing cards.
//********************************************************************
import java.util.*;

public class DeckOfCards
{
   /*
    * This class stores 52 objects of the Card objects.
    */
    
   private final int NUM_OF_CARDS = 52;
   private final int KING = 13;
   private ArrayList<Card> cardSet = new ArrayList<Card>();

   /* To produce 52 different cards */
   public DeckOfCards()
   {
      for (int i = 1; i <= KING; i++)
      {
         for (int j = 1; j <= 4; j++)
         {
            Card card = new Card(i,j);
            cardSet.add(card);
         }
      }
   }

   /* Mix them up! */
   public void shuffle()
   {
      /* Shuffle twice */
      for (int i = 0 ; i < NUM_OF_CARDS * 2 ; i++)
      {
         Random rand = new Random();
         int k = rand.nextInt(NUM_OF_CARDS);
         Card tempCard = cardSet.get(k);
         cardSet.remove(k);
         cardSet.add(tempCard);
      }
      System.out.println("Shuffle is done!\n");
   }

   /* Give out cards */
   public Card deal()
   {
      Card tempCard = cardSet.get(0);
      cardSet.remove(0);
      return tempCard;
   }

   /* Check if deck has more cards */
   public boolean hasMoreCards()
   {
      boolean b;
      if (cardSet.size() > 0)
         b = true;
      else
         b = false;
      return b; 
   }

   /* Report numbere of cards left in the deck */
   public int remain()
   {
      return cardSet.size();
   }

}
