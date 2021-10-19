class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int i = 0;
        while (i < n) {
            char temp = s[i];
            s[i] = s[n - 1];
            s[n - 1] = temp;
            i++;
            n--;
        }
    }
}