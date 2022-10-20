package com.alvin;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50},
            };
        int target = 39;
        int[] ans = bSearch2DMatrix(matrix, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] bSearch2DMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col])
                return new int[]{row,col};
            else if(target < matrix[row][col])
                col--;
            else
                row++;
        }
        return new int[]{-1, -1};
    }
}
