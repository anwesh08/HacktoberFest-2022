package com.Anwesh;

import java.util.Scanner;

public class AreaOfIsoTrio {
    public static void main(String[] args) {
        System.out.println("Area of Isosceles Triangle");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter height and base of the triangle : ");
        int ht = in.nextInt();
        int base = in.nextInt();
        float area = (float)(ht * base)/2;
        System.out.println("Area of Isosceles Triangle : " + area);
        in.close();
    }
}
