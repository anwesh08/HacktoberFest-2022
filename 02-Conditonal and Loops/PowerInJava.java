package com.Anwesh;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        System.out.println("Power in Java");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base number : ");
        int base = in.nextInt();
        System.out.print("Enter exponent number : ");
        int expo = in.nextInt();
        int res = 1;
        while (expo > 0) {
            res = base * res;
            expo--;
        }
        System.out.print("Result = " + res);
        in.close();
    }
}
