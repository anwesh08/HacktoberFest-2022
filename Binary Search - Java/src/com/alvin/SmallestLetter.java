package com.alvin;

public class SmallestLetter {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = smallLetter(arr, target);
        System.out.println(ans);
    }

    // return the index: smallest number >= target element
    static int smallLetter(int[] letters, int target) {

        int start = 0;
        int end = letters.length-1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start % letters.length];
    }
}
