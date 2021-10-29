package com.Anwesh;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr  = {1, 3, 23, 9, 18};
        swap(arr , 1, 3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
