class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr[i + 1]) i++;
            else break;
        }
        return i;
    }
}