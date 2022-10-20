package com.alvin;
//https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end= 0;

        for(int i=0; i <= nums.length; i++ ) {
            start = Math.max(start, nums[i]); // at the end of the loop, start will contain max value
            end += nums[i];
        }

        // binary search
        while(start < end) {
            // try for the middle as the potential ans
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid) {
                    // you can't add further to this array, make a new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m)
                start = mid + 1;
            else if (pieces <= 2)
                end = mid;
        }
        return end; // start = end
    }
}
