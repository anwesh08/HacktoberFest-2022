package com.Anwesh;

import java.util.Scanner;

public class SumOfDigitsOfANum {
    public static void main(String[] args) {
        System.out.println("Sum of digits of a number.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int sum = 0, rem;
        while (num != 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.print("Sum of digits : " + sum);
        in.close();
    }
}
