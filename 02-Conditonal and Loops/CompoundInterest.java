package com.Anwesh;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount = ");
        double amt = in.nextDouble();
        System.out.print("Enter Rate of Interest = ");
        double rate = in.nextDouble();
        System.out.print("Enter Time = ");
        double time = in.nextDouble();
        System.out.print("Enter number of time the interest is compounded = ");
        double num = in.nextDouble();
        double interest = (amt * Math.pow(1 + rate/100, (time * num)) - amt);
        System.out.println("Total amount = " + (interest + amt));
        System.out.println("Interest Amount = " + interest);
        in.close();
    }
}
