package com.Anwesh;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        System.out.println("How Many Numbers Are Smaller Than the Current Number");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms in array : ");
        int term = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] arr = new int[term];
        for (int i = 0; i < term; i++) {
            arr[i] = in.nextInt();
        }
        int[] ar = smallerNumbersThanCurrent(arr);
        System.out.println("Output Array = " + Arrays.toString(ar));
        in.close();
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0, i, j;
        for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}
