class Solution {
    public int maximumDifference(int[] nums) {
        int min = nums[0], max = nums[0];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            else {
                max = nums[i];
                ans = Math.max(ans, max - min);
            }
        }
        return (ans == 0) ? -1 : ans;
    }
}