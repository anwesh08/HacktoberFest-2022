package com.Anwesh;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int term = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] nums = new int[term];
        for (int i = 0; i < term; i++)
            nums[i] = in.nextInt();
        int[] arr = buildarray(nums);
        System.out.println("New Array : " + Arrays.toString(arr));
        in.close();
    }
    public static int[] buildarray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[nums[i]];
        return arr;
    }
}
