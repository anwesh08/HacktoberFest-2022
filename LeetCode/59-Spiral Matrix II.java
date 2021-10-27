class Solution {
    public int[][] generateMatrix(int n) {
        int nR = n;
        int nC = n;
        int top = 0;
        int bottom = nR;
        int left = 0;
        int right = nC;
        int j = 1;
        int[][] matrix = new int[n][n];
        while(left < right && top < bottom) {
            for(int i=left; i<right; i++) {
                matrix[top][i] = j;
                j++;
            }
            top++;
            for(int i=top; i<bottom; i++) {
                matrix[i][right-1] = j;
                j++;
            }
            right--;
            for(int i=right-1; i>=left; i--) {
                matrix[bottom-1][i] = j;
                j++;
            }
            bottom--;
            for(int i=bottom-1; i>=top; i--) {
                matrix[i][left] = j;
                j++;
            }
            left++;
        }
        return matrix;
    }
}