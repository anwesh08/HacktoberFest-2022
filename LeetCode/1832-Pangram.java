package com.Anwesh;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        System.out.println("Check if the Sentence Is Pangram");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = in.nextLine();
        boolean ans = checkIfPangram(sentence);
        System.out.println("Is Pangram : " + ans);
        in.close();
    }
    public static boolean checkIfPangram(String sentence) {
        char ch[]= new char[26];
        for(int i=0;i<sentence.length();i++)
            ch[sentence.charAt(i)-'a']++;
        for(int i=0;i<26;i++){
            if(ch[i]==0) return false;
        }
        return true;
    }
}
