package com.Anwesh;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        System.out.println("Permutation and Combination");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = in.nextInt();
        System.out.print("Enter R : ");
        int r = in.nextInt();
        int fact1 = 1, fact2 = 1, fact3 = 1, num = n, dif = n - r;
        while (num > 0) {
            fact1 = fact1 * num;
            num--;
        }
        while (dif > 0) {
            fact2 = fact2 * (dif);
            dif--;
        }
        if (r == 0) {
            fact3 = 1;
        } else {
            while (r > 0) {
                fact3 = fact3 * r;
                r--;
            }
        }
        int nPr = fact1 / fact2;
        int nCr = fact1 / (fact3 * fact2);
        System.out.println("Permutation = " + nPr);
        System.out.println("Combination = " + nCr);
        in.close();
    }
}
