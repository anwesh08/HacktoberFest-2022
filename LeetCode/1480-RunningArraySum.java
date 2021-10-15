package com.Anwesh;

import java.util.Arrays;
import java.util.Scanner;

public class RunningArraySum {
    public static void main(String[] args) {
        System.out.println("Running Sum of 1d Array");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms in array : ");
        int term = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] arr = new int[term];
        for (int i = 0; i < term; i++) {
            arr[i] = in.nextInt();
        }
        int[] ar = RunSum(arr);
        System.out.println("New array = " + Arrays.toString(ar));
        in.close();
    }
    public static int[] RunSum(int[] arr) {
        int[] sum = new int[arr.length];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
            sum[i] = temp;
        }
        return sum;
    }
}
