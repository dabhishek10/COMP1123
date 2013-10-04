//********************************************************************
//  Priority.java       Author: Luxing Huang (100113287)
//
//  Interface of Priority
//********************************************************************

public interface Priority
{
   //-----------------------------------
   // Assignment 9
   //
   // This is the Priority interface
   //-----------------------------------
   public final int MIN_PRIORITY = 1;
   public final int MED_PRIORITY = 5;
   public final int MAX_PRIORITY = 10;

   public void setPriority(int newPriority);
   public int getPriority();
}

