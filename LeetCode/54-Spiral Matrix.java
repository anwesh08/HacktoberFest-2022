class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int nR = matrix.length;
        int nC = matrix[0].length;
        int top = 0;
        int bottom = nR;
        int left = 0;
        int right = nC;
        List<Integer> res = new ArrayList<>();
        while(res.size() < nR*nC) {
            for(int i=left; i<right && res.size() < nR*nC; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<bottom && res.size() < nR*nC; i++) {
                res.add(matrix[i][right-1]);
            }
            right--;
            for(int i=right-1; i>=left && res.size() < nR*nC; i--) {
                res.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i=bottom-1; i>=top && res.size() < nR*nC; i--) {
                res.add(matrix[i][left]);
            }
            left++;
        }
        return res;
    }
}