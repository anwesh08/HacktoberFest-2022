class Solution {
    public int maximumProduct(int[] nums) {
        // Arrays.sort(nums);
        int flag;
        for (int i = 0; i < nums.length; i++) {
            flag = 0;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] + nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] = nums[j] - nums[j + 1];
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3], nums[0] * nums[1] * nums[nums.length - 1]);
    }
}