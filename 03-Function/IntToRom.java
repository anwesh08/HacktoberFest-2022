package com.Anwesh;

import java.util.Scanner;

public class IntToRom {
    public static void main(String[] args) {
        System.out.println("Integer To Roman");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int num = in.nextInt();
        String rom = intToRoman(num);
        System.out.print("Roman = " + rom);
        in.close();
    }
    public static String intToRoman( int n ) {
        String[] roman =  {"I" , "IV", "V", "IX", "X", "XL", "L" ,"XC" ,"C" ,"CD" ,"D", "CM" ,"M"};
        int[] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int index = roman.length - 1;
        StringBuilder str = new StringBuilder();
        while (n>0) {
            while (value[index] <= n) {
                str.append(roman[index]);
                n -= value[index];
            }
            index--;
        }
        return str.toString();
    }
}
