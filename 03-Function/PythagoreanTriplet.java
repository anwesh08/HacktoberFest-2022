package com.Anwesh;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        System.out.println("Entered Numbers are Pythagorean Triplet or Not.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        boolean ans = IsPythagorean(num1, num2, num3);
        System.out.print("Is Pythagorean Triplet : " + ans);
        in.close();
    }
    static boolean IsPythagorean(int ...v) {
        int x = v[0] * v[0];
        int y = v[1] * v[1];
        int z = v[2] * v[2];
        if (x == y + z || y == x + z || z == x + y) return true;
        return false;
    }
}
