package com.Anwesh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Fctorial of a Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = in.nextInt();
        System.out.println(num + "! = " + Fact(num));
        in.close();
    }
    public static int Fact(int num) {
        int fact = 1;
        if (num == 0 || num == 1) return fact;
        else {
            while (num > 0) {
                fact = fact * num;
                num--;
            }
        }
        return fact;
    }
}
