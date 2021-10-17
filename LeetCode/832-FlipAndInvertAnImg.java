package com.Anwesh;

import java.util.Arrays;
import java.util.Scanner;

public class FlipAndInvertAnImg {
    public static void main(String[] args) {
        System.out.println("Flipping an Image");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dimension of the matrix(n x n) : ");
        int n = in.nextInt();
        int[][] image = new int[n][n];
        System.out.println("Enter the value of binary matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                image[i][j] = in.nextInt();
        }
        int[][] invertimg = flipAndInvertImage(image);
        System.out.println("Inverted Array : ");
        for (int[] row: invertimg) {
            System.out.println(Arrays.toString(row));
        }
        in.close();
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] invert = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < n && k >= 0; j++ , k--) {
                invert[i][j] = image[i][k];
                if (invert[i][j] == 0) invert[i][j] = 1;
                else invert[i][j] = 0;
            }
        }
        return invert;
    }
}