package com.alvin;
//https://leetcode.com/problems/shuffle-the-array/

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
//        int[] nums = {2,5,1,3,4,7};
//        int[] nums = {1,2,3,4,4,3,2,1};
        int[] nums = {1,1,2,2};
        int n = nums.length/2;
        int[] ans = shuffle(nums, n);
        System.out.println(Arrays.toString(ans));
    }

    // leetcode algo that is efficient
    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];

        for(int i=0; i<n; i++){
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[n+i];
        }
        return res;
    }

}
