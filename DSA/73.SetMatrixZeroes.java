class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowHasZeroes = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //check if any element is 0
                if (matrix[i][j] == 0) {
                    //check for first row
                    if(i == 0)
                    firstRowHasZeroes = true;
                    else
                    matrix[i][0] = 0; // for any other row

                    //for cols
                    matrix[0][j] = 0;
                }
            }
        }

        //iterate from bottom right to top left
        for(int i = rows-1 ; i>=0;i--){
            for(int j = cols-1;j>=0;j--){

                //check if element is present in the 1st row & if ist row contains zeroes (which means we need to change the elements to 0)
                if(i==0 && firstRowHasZeroes)
                matrix[i][j] = 0;
                //for any other row check row & col values and change it to 0 accordingly
                else if(i!=0 && (matrix[i][0] == 0 || matrix[0][j] ==0) )
                matrix[i][j] = 0;
            }
        }
        
    }
}