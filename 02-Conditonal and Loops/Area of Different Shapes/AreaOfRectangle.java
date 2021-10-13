package com.Anwesh;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Area of Rectangle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int len = input.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int bre = input.nextInt();
        int area = len * bre;
        System.out.println("Area of the Rectangle : " + area);
        input.close();
    }
}
