package com.Anwesh;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println("Entered Alphabet is Vowel or Consonant");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an Alphabet : ");
        char alpha = in.next().charAt(0);
        if ((alpha >= 65 && alpha <= 90) || (alpha >= 97 && alpha <= 122)) {
            if (alpha == 'A' || alpha == 'a' || alpha == 'E' || alpha == 'e' || alpha == 'I' || alpha == 'i' || alpha == 'O' || alpha == 'o' || alpha == 'U' || alpha == 'u') {
                System.out.print("Alphabet is Vowel");
            }
            else
                System.out.print("Alphabet is Consonant");
        }
	else {
		System.out.println("Not a Alphabet");
	} 
        in.close();
    }
}
