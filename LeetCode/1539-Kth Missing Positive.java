class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            int missingcount = arr[mid] - 1 - mid;
            if(missingcount < k){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (high < 0) return k;
        int count = arr[high] - 1 - high;
        return arr[high] + k - count;
    }
}