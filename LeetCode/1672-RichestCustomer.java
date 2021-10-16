package com.Anwesh;

import java.util.Scanner;

public class RichestCustomer {
    public static void main(String[] args) {
        System.out.println("Richest Customer Wealth");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms(m x n) : ");
        int m = in.nextInt();
        int n = in.nextInt();
        System.out.print("Enter array elements : ");
        int[][] nums = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                nums[i][j] = in.nextInt();
        int maxWealth = maximumWealth(nums);
        System.out.println("Maximum Wealth = " + maxWealth);
        in.close();
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWel = 0, sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++)
                sum += accounts[i][j];
            if (sum > maxWel)
                maxWel = sum;
            sum = 0;
        }
        return maxWel;
    }
}
