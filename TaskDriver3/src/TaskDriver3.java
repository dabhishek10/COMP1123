//********************************************************************
//  TaskDriver3.java       Author: Lewis/Loftus
//
//  Solution to Programming Project 7.7
//********************************************************************

public class TaskDriver3
{
   public static void main(String args[])
   {
      Task3 task1 = new Task3("Homework");
      task1.setPriority(7);
      task1.setComplexity(8);

      Task3 task2 = new Task3("Eat lunch");
      task2.setPriority(Priority.MIN_PRIORITY);
      task2.setComplexity(2);

      Task3 task3 = new Task3("Attend class");
      task3.setPriority(Priority.MAX_PRIORITY);
      task3.setComplexity(6);

      Task3 task4 = new Task3("Ned's project");
      task4.setPriority(4);
      task4.setComplexity(5);

      System.out.println("\n  TO-DO\n---------");
      System.out.println(task1.getName()+"\t\tpriority: " +task1.getPriority()+
         "\tcomplexity: " + task1.getComplexity());
      System.out.println(task2.getName()+"\t\tpriority: " +task2.getPriority()+
         "\tcomplexity: " + task2.getComplexity());
      System.out.println(task3.getName() + "\tpriority: " +task3.getPriority()+
         "\tcomplexity: " + task3.getComplexity());
      System.out.println(task4.getName() + "\tpriority: " +task4.getPriority()+
         "\tcomplexity: " + task4.getComplexity());

      System.out.println();
      if (task1.compareTo(task2) < 0)
         System.out.println (task1.getName() + " is less important than " + 
                             task2.getName());
      else
         System.out.println (task1.getName() + " is more important than " + 
                             task2.getName());

      System.out.println();
      if (task3.compareTo(task4) < 0)
         System.out.println (task3.getName() + " is less important than " + 
                             task4.getName());
      else
         System.out.println (task3.getName() + " is more important than " + 
                             task4.getName());
   }
}