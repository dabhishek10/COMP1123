import java.util.Scanner;

public class Fibonacci
{
   static long result;

   public static void main(String args[])
   {
      System.out.println("Please enter nth Fibonacci number");
      Scanner scan = new Scanner(System.in);
      long f = scan.nextInt();      
      result = fib(f);
      System.out.println("Fib " + f + " is: " + result);
   }

   public static long fib(long n)
   {
      if (n <= 2)
         return 1;
      else
         return fib(n-1)+fib(n-2);
   }
}
