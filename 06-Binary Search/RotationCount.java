package com.Anwesh;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int ans = findPivot(arr) + 1;
        System.out.println("No of time array rotated = " + ans);
    }
    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid < end) && (arr[mid] > arr[mid + 1]))
                return mid;
            else if ((mid > start) && (arr[mid] < arr[mid - 1]))
                return mid - 1;
            else if (arr[start] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
