//********************************************************************
//  Username.java       Author: Luxing Huang (100113287)
//
//  Use of string processing
//********************************************************************
import java.util.Scanner;

public class Username
{
 //-----------------------------------
 // Assignment 3 | Question PP 3.1
 //
 // Read name and add random number
 //-----------------------------------
 public static void main(String[] args)
 {
      String firstName, lastName;
      int randomNumber;

      //Create scan object
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter your first name. ");
      firstName = scan.nextLine(); // Fetch first name.

      System.out.println("Please enter your last name. ");
      lastName = scan.nextLine(); // Fetch last name.

      randomNumber = (int) (Math.random() * 100); // Generate Random Number.
      System.out.println(firstName.charAt(0) + lastName.substring(0,5) + 
                         randomNumber);
 }
}

