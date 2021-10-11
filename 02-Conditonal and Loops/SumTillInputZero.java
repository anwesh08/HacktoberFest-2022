package com.Anwesh;

import java.util.Scanner;

public class SumTillInputZero {
    public static void main(String[] args) {
        System.out.println("Print the sum of all numbers till the user enters 0");
        Scanner in = new Scanner(System.in);
        int sum = 0, num;
        while (true) {
            System.out.print("Enter a number : ");
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            else {
                sum = sum + num;
            }
        }
        System.out.print("Sum of Numbers = " + sum);
        in.close();
    }
}
