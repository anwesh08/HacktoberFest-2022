package com.alvin;
//https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountsin {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    // finds the minimum index of the target number
    static int search(int[] arr, int target) {
        int peakIndex = peakIndexInMountainArray(arr);
        int firstHalf = binarySearch(arr, target, 0, peakIndex);
        if (firstHalf != -1)
            return firstHalf;
        else
            return binarySearch(arr, target, peakIndex+1, arr.length-1);
    }

    // finds peak index in a mountain array
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1])
                end = mid;
            else if(arr[mid] < arr[mid+1])
                start = mid + 1;
        }
        return start;
    }

    // performs order agnostic binary search
    static int binarySearch(int[] arr, int target, int start, int end) {

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if(isAsc) {
                if(target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if(target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
