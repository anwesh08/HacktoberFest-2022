package com.Anwesh;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println("Maximum & Minimum between 3 Nos");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 number : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int max = Max(num1, num2, num3);
        int min = Min(num1, num2, num3);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        in.close();
    }
    public static int Max(int x, int y, int z){
        int ans = Math.max(x , Math.max(y, z));
        return ans;
    }
    public static int Min(int x, int y, int z) {
         int ans = Math.min(x, Math.min(y, z));
         return ans;
    }
}
