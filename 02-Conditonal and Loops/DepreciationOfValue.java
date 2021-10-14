package com.Anwesh;

import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        System.out.println("Calculate Depreciation of Value");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Amount = ");
        int amt = in.nextInt();
        System.out.print("Enter Rate = ");
        float rate = in.nextInt();
        System.out.print("Enter Time(in year) = ");
        int time = in.nextInt();
        double depval =(double) (amt * Math.pow(1 - rate / 100, time));
        System.out.print("Depreciation Value  = " + depval);
        in.close();
    }
}
