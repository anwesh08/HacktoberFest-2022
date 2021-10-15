package com.Anwesh;

public class All3digitArmstringNos {
    public static void main(String[] args) {
        System.out.println("All 3 digit ARMSTRONG NUMBERS");
        for (int i = 100; i < 1000; i++) {
            if (IsArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean IsArmstrong(int num) {
        int x = num, sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = (int) (Math.pow(rem, 3) + sum);
            num /= 10;
        }
        return sum == x;
    }
}
