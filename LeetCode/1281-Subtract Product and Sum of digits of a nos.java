class Solution {
    public int subtractProductAndSum(int num) {
        int sum = 0, prod = 1;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += rem;
            prod *= rem;
        }
        return (prod - sum);
    }
}