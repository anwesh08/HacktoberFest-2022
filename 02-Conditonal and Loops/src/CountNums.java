package com.Anwesh;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        System.out.println("Same Digit Repeated in A Number");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long num = in.nextLong();
        System.out.println("Enter your digit : ");
        int digit = in.nextInt();
        int count = 0;
        while(num > 0) {
            long rem = num % 10;
            if (rem == digit) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("Digits repeated = " + count);
        in.close();
    }
}
