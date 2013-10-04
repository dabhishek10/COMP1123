//********************************************************************
//  FileContrast.java       Author: Luxing Huang (100113287)
//
//  Stream in 2 files and compare.
//********************************************************************
import java.util.*;
import java.io.*;

public class FileContrast
{
   //-----------------------------------
   // Assignment 4
   //
   // Use while statement.
   //-----------------------------------
   public static void main(String[] args) throws IOException
   {
      Scanner scan1 = new Scanner(new File("contrast1.dat"));
      Scanner scan2 = new Scanner(new File("contrast2.dat"));
       
      // Setting up scanners and variables
      String content1 = "", content2 = "";
      int count = 0;

      // Check if nextLine exists and do the compare
      while (scan1.hasNextLine() && scan2.hasNextLine() )
      {
         count++;
         content1 = scan1.nextLine();
         content2 = scan2.nextLine();
         if (!content1.equals(content2))
         {
            System.out.println("Line " + count + " in file 1:" + content1);
            System.out.println("Line " + count + " in file 2:" + content2 +
                               "\n");
         }
      }
   }
}
