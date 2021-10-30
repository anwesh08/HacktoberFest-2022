class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if(even(num)) count++;
        }
        return count;
    }
    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }
    static int digits(int num) {
        if (num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num) + 1);
    }
}