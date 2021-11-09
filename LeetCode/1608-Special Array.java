class Solution {
    public int specialArray(int[] nums) {
        int num = 0, count;
        while (num <= nums.length) {
            count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= num) count++;
            }
            if (count == num) return num;
            num++;
        }
        return -1;
    }
}