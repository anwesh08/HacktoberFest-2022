class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i+=2) {
            if (i == nums.length - 1) {
                ans = nums[i];
                break;
            }
            else {
                if (nums[i] != nums[i + 1])
                    return nums[i];
            }
        }
        return ans;
    }
}