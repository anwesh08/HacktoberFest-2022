package com.Anwesh;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        System.out.println("HCF & LCM of two numbers");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int temp, temp1, temp2, hcf, lcm;
        temp1 = num1;
        temp2 = num2;
        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf =temp1;
        lcm = (num1 * num2)/hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " +lcm);
        in.close();
    }
}
