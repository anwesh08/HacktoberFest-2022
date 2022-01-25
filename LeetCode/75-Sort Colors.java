class Solution {
    public void sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int x = nums[i];
            while (j > -1 && nums[j] > x) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = x;
        }
    }
}