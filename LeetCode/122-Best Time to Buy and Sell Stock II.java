class Solution {
    public int maxProfit(int[] prices) {
        int total = 0, max = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] < max)
                total += max - prices[i];
            max = prices[i];
        }
        return total;
    }
}