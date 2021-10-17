package com.Anwesh;

import java.util.Scanner;

public class FindNums {
    public static void main(String[] args) {
        System.out.println("Find Numbers with Even Number of Digits");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Number of even digit numbers = " + findNumbers(nums));
        in.close();
    }
    public static int findNumbers(int[] nums) {
        int count = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0) {
                int rem = nums[i] % 10;
                nums[i] /= 10;
                cnt++;
            }
            if (cnt % 2 == 0) count++;
            cnt = 0;
        }
        return count;
    }
}
