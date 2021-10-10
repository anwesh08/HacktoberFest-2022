package com.Anwesh;

import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println("Subtract the Product and Sum of Digits of an Integer");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = in.nextInt();
        int prod = 1, sum = 0;
        while(num > 0) {
            int rem = num % 10;
            prod = prod * rem;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println("Result = " + (prod - sum));
        in.close();
    }
}
