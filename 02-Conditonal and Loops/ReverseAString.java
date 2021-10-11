package com.Anwesh;

import java.util.Scanner;
import java.lang.String;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println("Reverse A String");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = in.next();
        char[] strrev = str.toCharArray();
        System.out.print("Reversed String : ");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(strrev[i]);
        }
        in.close();
    }
}
