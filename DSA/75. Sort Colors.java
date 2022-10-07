class Solution {
    public void sortColors(int[] nums) {
        int first = 0, last = nums.length - 1, index = 0;
        while (index <= last) {
            if (nums[index] == 2) {
                swap(nums, index, last);
                last--;
            }
            else if (nums[index] == 0) {
                swap(nums, index, first);
                first++;
                index++;
            } else {
                index++;
            }
        }
    }
     void swap(int[] arr, int pos1, int pos2) {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}