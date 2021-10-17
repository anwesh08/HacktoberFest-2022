package com.Anwesh;

import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        System.out.println("Transpose Matrix");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimension of matrix(n x n) : ");
        int n = in.nextInt();
        System.out.println("Enter matrix elements : ");
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        transpose(mat);
        for (int[] row: mat) {
            System.out.println(Arrays.toString(row));
        }
        in.close();
    }
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] trans = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
}
