//********************************************************************
//  SumProduct.java       Author: Luxing Huang (100113287)
//
//  Get to integers and show the sum and product.
//********************************************************************
import javax.swing.JOptionPane;

public class SumProduct
{
   //-------------------------------------------
   // Assignment 8
   //
   // Prompt 2 JOptionPane and get 2 Integers
   //-------------------------------------------
   public static void main(String[] args)
   {
      int num1, num2, sum, product, again;
      String numStr1, numStr2, result;
      
      do
      {
         numStr1 = JOptionPane.showInputDialog("Please enter 1st number:");
         num1 = Integer.parseInt(numStr1);

         numStr2 = JOptionPane.showInputDialog("Please enter 2nd number:");
         num2 = Integer.parseInt(numStr2);

         sum = num1 + num2;
         product = num1 * num2;

         result = "The sum is: " + sum + "\n The product is: " + product;

         JOptionPane.showMessageDialog(null,result);
         again = JOptionPane.showConfirmDialog(null,"Do another?");
      } while ( again == JOptionPane.YES_OPTION);
   }
}

