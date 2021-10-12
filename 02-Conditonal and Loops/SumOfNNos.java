package com.Anwesh;

import java.util.Scanner;

public class SumOfNNos {
    public static void main(String[] args) {
        System.out.println("Sum of N numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N : ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.print("Sum of N numbers = " + sum);
    }
}
