//********************************************************************
//  Task3.java       Author: Luxing Huang (100113287)
//
//  Project 7.5
//********************************************************************

public class Task3 implements Priority, Complexity, Comparable
{
   //-----------------------------------
   // Assignment 9
   //
   // Represent a task object.
   //-----------------------------------
   private int priority, complexity;
   private String name;
   public Task3(String taskName)
   {
      name = taskName;
      priority = MED_PRIORITY;
      complexity = 0;
   }

   public String getName()
   {
      return name;
   }

   public int getPriority()
   {
      return priority;
   }

   public void setPriority(int newPriority)
   {
      priority = newPriority;
   }

   public int getComplexity()
   {
      return complexity;
   }

   public void setComplexity(int newComplexity)
   {
      complexity = newComplexity;
   }
   
   public int compareTo(Task3 obj2)
   {
      if (getPriority() < obj2.getPriority())
      {
         return -1;
      }
      else
         return 1;
   }
   
   public String toString()
   {
      return name + "\t \t priority: " + priority + "\t \t Complexity: " + complexity + ".";
   }
}
