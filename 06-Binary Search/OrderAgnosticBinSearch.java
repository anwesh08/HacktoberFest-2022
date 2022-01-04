package com.Anwesh;

public class OrderAgnosticBinSearch {
    public static void main(String[] args) {
        int[] arr = {-75, -8, 9 , 10, 11, 45, 79 , 90};
        int target = 79;
        int ans = orderAgnosticBinSearch(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBinSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //Find whether the array is ascending or descending
        boolean isAoD = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            if (isAoD){
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            }
            else {
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }
        }
        return -1;
    }
}
