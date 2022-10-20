package com.alvin;

public class CeilingArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index: smallest number >= target element
    static int ceiling(int[] arr, int target) {

        // when target element is greater than the greatest element in the array
        if (target > arr[arr.length-1])
            return -1;

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return arr[mid];
            else if(target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
