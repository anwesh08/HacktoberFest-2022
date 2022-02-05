package com.Anwesh;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1 ,2, 3};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct])
                swap(nums, i, correct);
            else
                i++;
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
