class Solution {
    public int[] sumZero(int n) {

        int a[] = new int[n];
        for (int i = 0; i < n / 2; i++) {
            a[i] = n - i;
            a[n - i - 1] = i - n;
        }
        return a;
    }
}