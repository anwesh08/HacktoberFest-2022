class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> indices = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0)
                    indices.add(new int[] {i, j});
            }
        }
        for (int[] index : indices) {
            for (int i = 0; i < matrix[0].length; i++)
                matrix[index[0]][i] = 0;
            for (int j = 0; j < matrix.length; j++)
                matrix[j][index[1]] = 0;
        }
    }
}