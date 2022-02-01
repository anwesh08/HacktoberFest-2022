package com.Anwesh;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 6, 4};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] nums) {
        int flag;
        for (int i = 0; i < nums.length; i++) {
            flag = 0;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
//                    swap(nums[j], nums[j + 1]);
                    nums[j] = nums[j] + nums[j - 1];
                    nums[j - 1] = nums[j] - nums[j - 1];
                    nums[j] = nums[j] - nums[j - 1];
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }
//    static void swap(int temp1, int temp2) {
//        temp1 = temp1 + temp2;
//        temp2 = temp1 - temp2;
//        temp1 = temp1 - temp2;
//    }
}
