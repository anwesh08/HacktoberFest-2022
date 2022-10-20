package com.alvin;
//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int sum = 0; int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum >= maxWealth)
                maxWealth = sum;
            sum = 0;
        }
        return maxWealth;
    }
}

