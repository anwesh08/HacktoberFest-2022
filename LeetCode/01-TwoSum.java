class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,sum = 0;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}