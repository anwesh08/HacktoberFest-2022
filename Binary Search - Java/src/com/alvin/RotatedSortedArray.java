package com.alvin;
//https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={2,2,6,7,0,1,2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(target);

    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);
//        int pivot = findPivotWithDuplicates(arr);

        // if pivot not found then the array is not rotated
        if(pivot == -1){
            // do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }

        // If pivot is found, then two asc arrays is found
        if(arr[pivot] == target)
            return pivot;
        if (target >= arr[0])
            return binarySearch(arr, target, 0, pivot-1);

        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;
            if(arr[start] >= arr[mid])
                end = mid - 1;
            else if(arr[start] <= arr[mid])
                start = mid + 1;
        }
        return -1;
    }

    // this will work with duplicate values
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid] < arr[mid-1])
                return mid-1;

            // if elements at start, mid and end are equal then skip the duplicates
            if(arr[start] == arr[mid] && arr[start] == arr[end]) {
                // skip the duplicates
                // Note: what if the start and end elements were pivots ?

                // check if start is the pivot
                if (arr[start] > arr[start + 1])
                    return start;
                start++;

                // check if end is the pivot
                if (arr[end] > arr[start])
                    return end;
                end--;
            }
            // left half is sorted so pivot lies in the right half
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]))
                start = mid + 1;
            else
                end = mid -1;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
