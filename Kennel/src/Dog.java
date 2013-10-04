//********************************************************************
//  Dog.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 4.2 
//********************************************************************

public class Dog
{
   private String name;
   private int age;

   //-----------------------------------------------------------------
   //  Sets up this Dog object with the specified data.
   //-----------------------------------------------------------------
   public Dog (String nameInit, int ageInit)
   {
      name = nameInit;
      age = ageInit;
   }

   //-----------------------------------------------------------------
   //  Name accessor.
   //-----------------------------------------------------------------
   public String getName ()
   {
	   return name;
   }

   //-----------------------------------------------------------------
   //  Name mutator.
   //-----------------------------------------------------------------
   public void setName (String nameUpdate)
   {
	   name = nameUpdate;
   }

   //-----------------------------------------------------------------
   //  Age accessor.
   //-----------------------------------------------------------------
   public int getAge ()
   {
	   return age;
   }

   //-----------------------------------------------------------------
   //  Age mutator.
   //-----------------------------------------------------------------
   public void setAge (int ageUpdate)
   {
	   age = ageUpdate;
   }

   //-----------------------------------------------------------------
   //  Computes and returns this dog's age in "person-years".
   //-----------------------------------------------------------------
   public int personYears ()
   {
      return age * 7;
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this dog.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return "Dog: " + name + "   Age: " + age + "   Person-Years: "
             + personYears();
   }
}
