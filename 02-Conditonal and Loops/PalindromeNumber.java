package com.Anwesh;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int snum = num, rev = 0, rem;
        while (snum > 0) {
            rem = snum % 10;
            rev = rev * 10 + rem;
            snum /= 10;
        }
        if (rev == num)
            System.out.print("Palindrome Number");
        else
            System.out.print("Not a Palindrome Number");
        in.close();
    }
}
