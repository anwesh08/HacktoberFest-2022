package com.alvin;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int[] arr= {7, 9, 11, 12, 5};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    }

    // for non duplicates
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
}
