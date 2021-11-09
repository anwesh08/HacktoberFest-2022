class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[nums.length-1];
        else if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        else {
            for (int i = 0; i < nums.length; i += 2) {
                if (nums[i] != nums[i + 1])
                    return nums[i];
            }
        }
        return -1;
    }
}