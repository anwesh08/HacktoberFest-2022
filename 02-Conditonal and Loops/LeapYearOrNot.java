package com.Anwesh;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Leap Year or Not");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year = in.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("Leap Year");
                } else {
                    System.out.print("Not a Leap Year");
                }
            }
            System.out.print("Leap Year");
        } else {
            System.out.print("Not a Leap Year");
        }
    }
}
