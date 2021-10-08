import java.util.Scanner;

public class CurrencyConverter {
   public static void main(String[] args) {
      System.out.println("INR to USD Currency Converter");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter amount in INR");
      int amt = input.nextInt();
      float usd = amt/(float)74.84;
      System.out.println("Amount in USD = " + usd);
      input.close();
   }
}
