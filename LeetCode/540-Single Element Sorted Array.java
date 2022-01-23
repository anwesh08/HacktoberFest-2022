class Solution {
    public int singleNonDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 2;
        while (start <= end) {
            int mid = (start + end) >> 1;
            if (arr[mid] == arr[mid^1])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr[start];
    }
}