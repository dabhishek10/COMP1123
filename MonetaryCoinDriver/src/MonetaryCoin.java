//********************************************************************
//  MonetaryCoin.java       Author: Luxing Huang/100113287
//
//  Represents the coin's value.
//********************************************************************
import java.text.*;

public class MonetaryCoin extends Coin
{
   private int coinValue;
   NumberFormat money = NumberFormat.getCurrencyInstance();

   /* Constructor for MonetaryCoin */
   public MonetaryCoin(int value)
   {
      coinValue = value;
   }

   /* getValue method */
   public int getValue()
   {
      return coinValue;
   }

   /* toString method */
   public String toString()
   {
      String coinString;
      coinString = (super.toString() + " " + 
                    money.format((double)coinValue/100));
      return coinString;
   }
}
