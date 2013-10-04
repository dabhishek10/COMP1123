//********************************************************************
//  Kennel.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.2 
//********************************************************************

public class Kennel
{
   //-----------------------------------------------------------------
   //  Creates and exercises some Dog objects.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Dog d1 = new Dog ("Spot", 4);
      Dog d2 = new Dog ("Fluffy", 1);
      Dog d3 = new Dog ("Killer", 7);
      Dog d4 = new Dog ("King Tut", 3);

      System.out.println (d1);
      System.out.println (d2);
      System.out.println (d3);
      System.out.println (d4);

      d3.setAge (d3.getAge()+1);
      System.out.println ("Happy Birthday, " + d3.getName());
      System.out.println ("You are now " + d3.personYears() +
         " years old in person-years.");
   }
}
