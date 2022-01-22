class Solution {
    public boolean search(int[] nums, int target) {
        int ans = Rsearch(nums, target);
        if (ans != -1)
            return true;
        return false;
    }
    int Rsearch(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
        if (pivot == -1) {
            return Binsearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target)
            return pivot;
        if (nums[0] <= target)
            return Binsearch(nums, target, 0, pivot - 1);
        return Binsearch(nums, target, pivot + 1, nums.length - 1); 
    }
    int Binsearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                start = mid + 1;
            else
                return mid;
        }
        return -1;
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
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}