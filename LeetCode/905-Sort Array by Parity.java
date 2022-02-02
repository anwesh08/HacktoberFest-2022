class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0 , last = nums.length , starting = 0;
        while(start < last){
            if (nums[start] % 2 == 0) {
                swap(nums, starting, start);
                starting++;
                start++;
             }
             else{
                start++;
             }
          }
        return nums;
    }
    void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}