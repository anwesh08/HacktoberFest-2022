package com.Anwesh;

import java.util.Scanner;

public class DistanceBtw2Pts {
    public static void main(String[] args) {
        System.out.println("Find the distance between 2 points");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter co-ordinates of point 1 : ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("Enter co-ordinates of point 2 : ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        double dist = (double) Math.sqrt((int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2));
        System.out.print("Distance between 2 points = " + dist);
        in.close();
    }
}
