class Solution {
    public int[] replaceElements(int[] arr) {
        int[] replace = new int[arr.length];
        int last = arr.length - 1;
        for (int i = 0; i < arr.length - 1; i++) {
            replace[i] = getMax(arr, i + 1, last);
        }
        replace[arr.length - 1] = -1;
        return replace;
    }
    int getMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return arr[max];
    }
}