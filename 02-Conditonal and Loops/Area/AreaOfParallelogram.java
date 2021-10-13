package com.Anwesh;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        System.out.println("Area of Parallelogram");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base and height of parallelogram : ");
        int base = in.nextInt();
        int height = in.nextInt();
        int area = base * height;
        System.out.println("Area of Parallelogram = " + area);
        in.close();
    }
}
