package com.Anwesh;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Area of Triangle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the three sides");
        System.out.println("Enter 1st side : ");
        int a = input.nextInt();
        System.out.println("Enter 2nd side : ");
        int b = input.nextInt();
        System.out.println("Enter 3rd side : ");
        int c = input.nextInt();
        float s = (float)(a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of the Triangle = " + area);
        input.close();
    }
}
