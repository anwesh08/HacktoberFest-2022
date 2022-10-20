package com.alvin;
//https://leetcode.com/problems/guess-number-higher-or-lower/

public class HigherOrLower {
    public static void main(String[] args) {
        int n = 10;
        int ans = binarySearch(n);
        System.out.println(ans);
    }

    static int guess(int mid) {
        int pick = 2;
        return Integer.compare(pick, mid);
    }

    static int binarySearch(int n) {
        int start = 1;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if(res == 0)
                return mid;
            else if(res < 0)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
