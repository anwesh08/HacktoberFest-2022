import java.util.Scanner;

public class Largest {
   public static void main(String[] args) {
      System.out.println("Largest Between Two Numbers");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter Two Numbers");
      System.out.println("Enter first number : ");
      int no1 = input.nextInt();
      System.out.println("Enter second number : ");
      int no2 = input.nextInt();
      if (no1 > no2) {
         System.out.println(no1 + " is greater than " + no2);
      }
      else {
         System.out.println(no2 + " is greater than " + no1);
      }
      input.close();
   }
}
