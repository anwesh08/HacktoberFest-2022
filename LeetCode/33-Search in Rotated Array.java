class Solution {
    int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return Binsearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target)
            return pivot;
        if (nums[0] <= target)
            return Binsearch(nums, target, 0, pivot - 1);
        return Binsearch(nums, target, pivot + 1, nums.length - 1); 
    }
    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid < end) && (arr[mid] > arr[mid + 1]))
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
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
}