//********************************************************************
//  MoneyConversion.java       Author: Luxing Huang (100113287)
//
//  Input an amount of money and calculate the number of money needed.
//********************************************************************

import java.util.Scanner;

public class MoneyConversion
{
   //----------------------------------------------
   // Assignment 2 / Question pp 2.11 
   //
   // Input money and convert to bills and coins
   //----------------------------------------------
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int moneyInt, tenDollar, fiveDollar, oneDollar, quaterDollar;
      int nickleDollar, dimeDollar;
      
      System.out.println("Please enter the amount of monty: ");
      double inputMoney = scan.nextDouble();
      scan.close();

      moneyInt = (int) (inputMoney * 100);

      tenDollar = moneyInt / 1000;
      moneyInt = moneyInt - 1000 * tenDollar;

      fiveDollar = moneyInt / 500;
      moneyInt = moneyInt - 500 * fiveDollar;

      oneDollar = moneyInt / 100;
      moneyInt = moneyInt - 100 * oneDollar;

      quaterDollar = moneyInt / 25;
      moneyInt = moneyInt - 25 * quaterDollar;

      dimeDollar = moneyInt / 10;
      moneyInt = moneyInt - 10 * dimeDollar;

      nickleDollar = moneyInt / 5;
      moneyInt = moneyInt - 5 * nickleDollar;

      System.out.println(tenDollar + " ten dollar bills.");
      System.out.println(fiveDollar + " five dollar bills.");
      System.out.println(oneDollar + " one dollar bills.");
      System.out.println(quaterDollar + " quaters.");
      System.out.println(dimeDollar + " dimes.");
      System.out.println(nickleDollar + " nickles.");
      System.out.println(moneyInt + " pennies.");
   }
}

