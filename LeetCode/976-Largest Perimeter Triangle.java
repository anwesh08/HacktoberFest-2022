class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i + 2 < nums.length) && (nums[i] + nums[i + 1] > nums[i + 2])) {
                sum = nums[i] + nums[i + 1] + nums[i + 2];
            }
        }
        return sum;
    }
}