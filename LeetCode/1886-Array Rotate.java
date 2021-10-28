class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++){
            mat = rotate(mat);
            if (check(mat, target)) {
                return true;
            }
        }
        return false;
    }
    public boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    public int[][] rotate(int[][] mat) {
        int col = mat.length;
        int[][] arr = new int[col][col];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                arr[j][col - 1] = mat[i][j];
            }
            col--;
        }
        return arr;
    }
}