package com.Anwesh;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Perfect Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int snum = num, sum = 0, i = 1;
        while (i <= num / 2) {
            if (num % i == 0) {
                sum += i;
                i++;
            } else {
                i++;
            }
        }
        boolean ans = (snum == sum);
        System.out.println("Is Perfect : " + ans);
    }
}
