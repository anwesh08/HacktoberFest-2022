class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i = 0;
        int j = n - 1;
        int dist = n / 2;
        while (i < j) {
            arr[i] = -dist;
            arr[j] = dist;
            i++;
            j--;
            dist--;
        }
        return arr;
    }
}