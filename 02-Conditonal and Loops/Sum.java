package com.Anwesh;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user till it enters zero.");
        Scanner in = new Scanner(System.in);
        int esum = 0, nsum = 0, osum = 0, num;
        while (true) {
            System.out.print("Enter number : ");
            num = in.nextInt();
            if (num == 0) break;
            if (num < 0) nsum += num;
            else if (num % 2 == 0) esum += num;
            else osum += num;
        }
        System.out.println("Negative Sum = " + nsum);
        System.out.println("Positive Even Sum = " + esum);
        System.out.println("Positive Odd Sum = " + osum);
    }
}
