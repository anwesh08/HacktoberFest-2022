package com.alvin;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5 ,6},
                {7, 8, 9}
            };
        int target = 6;
        int[] ans = search(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1)
            return binarySearch(matrix, 0, 0, cols-1, target);

        int colStart = 0; int colEnd = cols - 1;
        int colMid =  colStart + (colEnd - colStart) / 2;

        int rowStart = 0;
        int rowEnd = rows - 1;

        // run the loop till two rows remaining
        // while(rowStart < (rowEnd-1) ) {
        while(rowStart < (rowEnd-1)) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            if(target == matrix[rowMid][colMid])
                return new int[]{rowMid, colMid};
            else if(target > matrix[rowMid][colMid])
                rowStart = rowMid;
            else if(target < matrix[rowMid][colMid])
                rowEnd = rowMid;

        }

        // now only two rows exist
        // check whether the target is in the col of two rows
        if(target == matrix[rowStart][colMid])
            return new int[]{rowStart, colMid};
        else if(target == matrix[rowStart+1][colMid])
            return new int[]{rowStart+1, colMid};

        // else check in the
        // first Half
        if(target <= matrix[rowStart][colMid-1])
            return binarySearch(matrix, rowStart, 0, colMid-1, target);

        // second Half
        else if(target >= matrix[rowStart][colMid+1] && target <= matrix[rowStart][colEnd])
            return binarySearch(matrix, rowStart, colMid+1, colEnd, target);

        // third Half
        else if(target <= matrix[rowStart+1][colMid-1])
            return binarySearch(matrix, rowStart+1, 0, colMid-1, target);

        // fourth Half
        else
            return binarySearch(matrix, rowStart+1, colMid+1, colEnd, target);

    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target ){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;

            if(matrix[row][mid] == target)
                return new int[]{row, mid};
            else if(target > matrix[row][mid])
                colStart = mid + 1;
            else
                colEnd = mid -1;
        }
        return new int[]{-1, -1};
    }
}
