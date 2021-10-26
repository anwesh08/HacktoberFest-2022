class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMat = new int[r][c];
        if (mat.length* mat[0].length != r*c) {
            return mat;
        }
        else {
            int m = 0;
            int n = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    newMat[m][n++] = mat[i][j];
                    if (n == c) {
                        n = 0;
                        m++;
                    }
                }
            }
        }
        return newMat;
    }
}