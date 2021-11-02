class Solution {
    public int removeDuplicates(int[] nums) {
        int toBe = 2;
        int curr = 2;
        while (curr < nums.length) {
            if (nums[curr] != nums[toBe - 2]) {
                nums[toBe] = nums[curr];
                toBe++;
            }
            curr++;
        }
        return toBe;
    }
}