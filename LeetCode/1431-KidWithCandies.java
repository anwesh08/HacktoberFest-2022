package com.Anwesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KidWithCandies {
    public static void main(String[] args) {
        System.out.println("Kids With the Greatest Number of Candies");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of kids : ");
        int kids = in.nextInt();
        System.out.print("Enter number of candies each kid have : ");
        int[] candies = new int[kids];
        for (int i = 0; i < candies.length; i++) {
            candies[i] = in.nextInt();
        }
        System.out.print("Enter number of extra candies left : ");
        int extracandies = in.nextInt();
        List<Boolean> ans = kidsWithCandies(candies, extracandies);
        System.out.print("Greatest number of candies among all kids : ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        in.close();
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extracandy) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) max = candies[i];
        }
        for (int i = 0; i < candies.length; i++) {
            if (max > extracandy + candies[i]) list.add(false);
            else list.add(true);
        }
        return list;
    }
}
