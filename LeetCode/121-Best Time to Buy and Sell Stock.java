class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], max = prices[0];
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else {
                max = prices[i];
                ans = Math.max(ans, max - min);
            }
        }
        return ans;
    }
}