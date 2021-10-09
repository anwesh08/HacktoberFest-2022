import java.util.Scanner;

public class EverOrOdd {
   public static void main(String[] args) {
      System.out.println("Input Number is Even or Odd.");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a Number : ");
      int number = input.nextInt();
      if (number % 2 == 0) {
         System.out.println("Number is Even");
      }
      else {
         System.out.println("Number is Odd");
      }
      input.close();
   }
}