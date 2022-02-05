package com.Anwesh;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1 ,2, 3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] nums) {
        for (int i = 0; i <= nums.length - 2; i++) {
            int j  = i + 1;
            while (j > 0) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                }
                else
                    break;
                j--;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
