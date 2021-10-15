package com.Anwesh;

import java.lang.constant.Constable;
import java.util.Scanner;

public class PrimeNosBetween2Nos {
    public static void main(String[] args) {
        System.out.println("Prime Nos between 2 Numbers.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        for (int i = num1; i <= num2; i++) {
            if (IsPrime(i))
                System.out.print(i + " ");
        }
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
