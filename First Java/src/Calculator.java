import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      System.out.println("Calculator");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Two Numbers");
      System.out.println("Enter first number : ");
      int no1 = input.nextInt();
      System.out.println("Enter second number : ");
      int no2 = input.nextInt();
      System.out.println("Enter operator(+,-,*,/) :");
      char operator = input.next().charAt(0);
      if (operator == '+') {
         int sum = no1 + no2;
         System.out.println("Sum = " + sum);
      }
      else if (operator == '-') {
         int diff = no1 - no2;
         System.out.println("Difference = " + diff);
      }
      else if (operator == '*') {
         int prod = no1 * no2;
         System.out.println("Product = " + prod);
      }
      else if (operator == '/') {
         int qou = no1/no2;
         System.out.println("Quotient = " + qou);
      }
      input.close();
   }
}
