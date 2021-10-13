package com.Anwesh;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Area of Circle");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        int rad = input.nextInt();
        float area = 3.14f*(float)rad*(float)rad;
        System.out.println("Area of circle = " + area);
        input.close();
    }
}
