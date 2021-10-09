package com.Anwesh;

import java.util.Scanner;

public class LargestTillInputZero {
    public static void main(String[] args) {
        System.out.println("Print the largest number from all till the user enters 0");
        Scanner in = new Scanner(System.in);
        int num, max = 0;
        while (true) {
            System.out.print("Enter a number : ");
            num = in.nextInt();
            if (num == 0) {
                break;
            } else {
                max = Math.max(max, num);
            }
        }
        System.out.print("Largest Number = " + max);
    }
}
