class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < expected.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        int count = 0;
        for(int j = 0; j < heights.length; j++) {
            if (heights[j] != expected[j]) {
                count++;
            }
        }
        return count;
    }
}