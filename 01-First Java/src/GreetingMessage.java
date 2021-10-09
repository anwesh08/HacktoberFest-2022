import java.util.Scanner;

public class GreetingMessage {
   public static void main(String[] args) {
      System.out.println("Greeting Message");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter your Name : ");
      String name = input.nextLine();
      System.out.println("Welcome " + name + " to Java Programming");
      input.close();
   }
}