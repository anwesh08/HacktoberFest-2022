package com.Anwesh;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        System.out.println("Fibonnaci Series");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth Term : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        System.out.print("Fibonnaci Series : " + a + " " + b);
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(" " + b);
        }
        in.close();
    }
}
