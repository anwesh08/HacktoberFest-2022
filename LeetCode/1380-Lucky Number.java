class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            int index = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    index = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                if (max < matrix[j][index]) max = matrix[j][index];
            }
            if (max == min) list.add(min);
        }
        return list;
    }
}