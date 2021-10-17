class Solution {
    public int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        int temp = 0;
        int max = alt[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            temp += gain[i];
            alt[i + 1] = temp;
        }
        for (int i = 0; i < alt.length; i++) {
            if (max < alt[i]) max = alt[i];
        }
        return max;
    }
}