package com.alvin;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        boolean findStartIndex;

        // check for the first occurrence if target first
        ans[0] = search(nums, target, findStartIndex = true);
        if(ans[0] != -1) {
            // check for the last occurrence if target last
            ans[1] = search(nums, target, findStartIndex = false);
        }

        return ans;
    }

    //this function returns the index value of the target
    static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if(target < nums[mid])
                end = mid - 1;
            else if(target > nums[mid])
                start = mid + 1;
            else {
                // potentioal ans found
                ans = mid;
                if (findStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
