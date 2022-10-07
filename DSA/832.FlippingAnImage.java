class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        // int row =image.length;
        int col = image[0].length;
        // int ans[][] = new int[row][col];
        
        //direct using xor
        //  for (int i = 0; i < row; i++) {
        //     for (int j = 0; j <col; j++) {
        //         ans[i][j] = 1^image[i][col - j - 1];
        //     }
        // }
        // return ans;

        //acc to what q has demanded
        for (int[] row : image) {
            for (int i = 0; i < (col + 1)/2; i++) {
                int temp = row[i]^1;
                row[i] = row[col-1-i]^1;
                row[col-1-i] = temp;
            }
        }



        return image;
    }
}