package com.Anwesh;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms : ");
        int term = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] nums = new int[term];
        for (int i = 0; i < term; i++)
            nums[i] = in.nextInt();
        int[] arr = getConcatenation(nums);
        System.out.println("New Concatenated Array : " + Arrays.toString(arr));
        in.close();
    }
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++)
            arr[i] = nums[i];
        for (int i = nums.length; i < arr.length; i++)
            arr[i] = nums[i - nums.length];
        return arr;
    }
}
