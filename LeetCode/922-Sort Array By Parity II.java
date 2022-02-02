class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int oddIdx = 1, evenIdx = 0;
        while (oddIdx < nums.length && evenIdx < nums.length) {
            if (nums[oddIdx] % 2 < nums[evenIdx] % 2) {
                swap(nums, oddIdx, evenIdx);
            }
            if (nums[oddIdx] % 2 != 0)
                oddIdx += 2;
            if (nums[evenIdx] % 2 == 0)
                evenIdx += 2;
        }
        return nums;
    }
    void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}