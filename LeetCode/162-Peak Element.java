class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1, mid = 0;
        if (n == 1) return 0;
        if (nums[high] > nums[high - 1]) return high;
        if (nums[low] > nums[low + 1]) return low;
        while (low < high) {
            mid = (low + high)/2;
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] > nums[mid - 1]) low = mid;
            else high = mid;
        }
        return -1;
    } 
}