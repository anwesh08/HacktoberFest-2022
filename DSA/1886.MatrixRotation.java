class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for (int i = 0; i < 4; i++) {
            mat = rotate(mat);

            if(check(mat,target))
            return true;
        }
        return false;
    }
    
    boolean check(int[][] mat, int[][] target){
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                
                if(mat[i][j] != target[i][j])
                return false;
            }
        }
        return true;
    }

    int[][] rotate(int[][] mat){
        int col = mat.length-1;
        int[][] n = new int[col+1][col+1]; //new 2d array with length same as mat
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                n[j][col] = mat[i][j]; //putting row wise value of mat to column wise places in n
            }
            col--;
        }
        return n;
    }
}