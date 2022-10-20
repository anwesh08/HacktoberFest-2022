package com.alvin;
//https://leetcode.com/problems/first-bad-version/

public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 9;
        int ans = firstBadVersion(n);
        System.out.println(ans);
    }

    static boolean isBadVersion(int mid) {
        int bad = 5;
        return mid >= bad;
    }
    static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid))
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
