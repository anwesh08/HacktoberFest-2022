class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for (int[] arr : indices) {
            int row = arr[0];
            int col = arr[1];
            // row increment
            for (int i = 0; i < n; i++)
                mat[row][i]++;
            // col increment
            for (int i = 0; i < m; i++)
                mat[i][col]++;
        }
        int odd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0)
                    odd++;
            }
        }
        return odd;
    }
}