package com.Anwesh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Fctorial of a Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        int fact = 1;
        while (num > 0) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial = " + fact);
        in.close();
    }
}
