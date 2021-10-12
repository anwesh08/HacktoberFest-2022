package com.Anwesh;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 3 digit number : ");
        int num = in.nextInt();
        int sum = 0, snum = num, rem;
        while (snum != 0) {
            rem = snum % 10;
            sum = sum + (int) Math.pow(rem, 3);
            snum /= 10;
        }
        if (num == sum)
            System.out.print("Armstrong Number");
        else
            System.out.print("Not a Armstrong Number");
        in.close();
    }
}
