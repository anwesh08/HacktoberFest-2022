import java.util.Scanner;

public class SimpleInterest {
   public static void main(String[] args) {
      System.out.println("Find The Simple Interest");
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the Principal Amount :");
      int principal = input.nextInt();
      System.out.println("Enter the Rate : ");
      int rate = input.nextInt();
      System.out.println("Enter the Time : ");
      int time = input.nextInt();
      int si = (principal * rate * time)/100;
      System.out.println("Simple Interest = " + si);
      input.close(); 
   }
}
