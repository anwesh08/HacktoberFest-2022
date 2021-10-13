package com.Anwesh;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        System.out.println("Area of Rhombus");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of diagonals : ");
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        float area = (float)(d1*d2)/2;
        System.out.println("Area of Rhombus = " + area);
        in.close();
    }
}
