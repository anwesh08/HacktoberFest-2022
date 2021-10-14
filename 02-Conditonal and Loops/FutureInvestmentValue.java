package com.Anwesh;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        System.out.println("Future Investment Value");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        int amt = in.nextInt();
        System.out.print("Enter Rate : ");
        float rate = in.nextFloat();
        System.out.print("Enter Time Period : ");
        int time = in.nextInt();
        double fiv = (double) (amt * Math.pow((1 + rate/100), time));
        System.out.print("Future Investment Value = " + fiv);
        in.close();
    }
}
