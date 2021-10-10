package com.Anwesh;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        System.out.println("Reverse Of A Number");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = in.nextInt();
        int rem;int rev = 0;
        while(num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println("Reverse of the Number = " + rev);
    }
}
