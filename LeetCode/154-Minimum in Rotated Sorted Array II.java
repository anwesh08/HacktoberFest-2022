class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivotWithDuplicates(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        return nums[(pivot % nums.length) + 1];
    }
    int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid < end) && (arr[mid] > arr[mid + 1]))
                return mid;
            if ((mid > start) && (arr[mid] < arr[mid - 1]))
                return mid - 1;
            if ((arr[mid] == arr[start]) && (arr[mid] == arr[end])){
                if ((start < end) && (arr[start] > arr[start + 1]))
                    return start;
                start++;
                if ((end > start) && (arr[end] < arr[end - 1]))
                    return end - 1;
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}