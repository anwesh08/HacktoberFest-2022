package com.alvin;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 9;
        int ans = mySqrt(x);
        System.out.println(ans);
    }

    static int mySqrt(int x){

        if(x <= 1)
            return x;

        int start = 1;
        int end = x/2;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int temp = mid*mid;

            if(temp == x)
                return mid;
            else if(temp < x)
                start = mid+1;
            else
                end = mid-1;
        }
        return end;
    }
}
