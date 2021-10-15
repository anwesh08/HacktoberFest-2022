package com.Anwesh;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Entered Number is Prime or Not.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        boolean ans = IsPrime(num);
        System.out.print("Is Prime : " + ans);
        in.close();
    }
    static boolean IsPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int c = 2;
        while (c * c < num ) {
            if (num % c == 0) return false;
            c++;
        }
        return c * c > num;
    }
}
