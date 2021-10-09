package com.Anwesh;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.println("Factors of a Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = in.nextInt();
        int count = 0;
        int i = 1;
        System.out.print("Factors of the Interger are : ");
        while (i <= num) {
            if(num % i == 0) {
                count++;
                System.out.print(i + " ");
                i++;
            }
            else {
                i++;
            }
        }
        System.out.println();
        System.out.print("Total number of factors = " + count);
    }
}
