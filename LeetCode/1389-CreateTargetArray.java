package com.Anwesh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTargetArray {
    public static void main(String[] args) {
        System.out.println("Create Target Array in the Given Order");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = in.nextInt();
        System.out.print("Enter array elements : ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = in.nextInt();
        System.out.print("Enter index array elements(0 to i) : ");
        int[] index = new int[n];
        for (int i = 0; i < n; i++)
            index[i] = in.nextInt();
        int[] target = createTargetArray(nums, index);
        System.out.println("New Array = " + Arrays.toString(target));
    }
    public static int[] createTargetArray(int[] nums, int[] index){
        ArrayList list = new ArrayList<>();
        for (int i = 0; i < index.length; i++)
            list.add(index[i], nums[i]);
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            result[i] = (int) list.get(i);
        return result;
    }
}
