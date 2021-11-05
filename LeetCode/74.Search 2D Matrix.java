class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] mat : matrix) {
            int low = 0, high = mat.length - 1;
            if (mat[low] <= target && mat[high] >= target) {
                return binsearch(mat, target);
            }
        }
        return false;
    }
    boolean binsearch(int[] mat, int target) {
        int low = 0, high = mat.length - 1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (target == mat[mid]) return true;
            else if (target < mat[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}