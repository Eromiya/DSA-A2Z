package com.striver.a2z.dynamicprogramming.dponstocks;

import java.util.Arrays;

public class DP38_BuyAndSellStock4_188 {
    public static int maxProfit_Rec(int[] prices, int ind, int buy, int cap) {
        if(ind >= prices.length || cap ==0){
            return 0;
        }
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[ind] + maxProfit_Rec(prices, ind + 1, 0, cap), maxProfit_Rec(prices, ind + 1, 1, cap));
        } else {
            profit = Math.max(prices[ind] + maxProfit_Rec(prices, ind + 1, 1, cap-1), maxProfit_Rec(prices, ind + 1, 0, cap));
        }
        return  profit;
    }

    public static int maxProfit_Mem(int[] prices, int ind, int buy, int[][][] dp, int cap) {
        if(ind >=prices.length || cap == 0){
            return 0;
        }
        if(dp[ind][buy][cap]!=-1){
            return dp[ind][buy][cap];
        }
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[ind] + maxProfit_Mem(prices, ind + 1, 0, dp, cap), maxProfit_Mem(prices, ind + 1, 1, dp, cap));
        } else {
            profit = Math.max(prices[ind] + maxProfit_Mem(prices, ind + 1, 1, dp, cap-1), maxProfit_Mem(prices, ind + 1, 0, dp, cap));
        }
        return  dp[ind][buy][cap] = profit;
    }

    public static int maxProfit_Tab(int[] prices, int k) {
        int n = prices.length;
        int[][][] dp = new int[n+1][2][k+1];
        for(int ind= n-1;ind>=0;ind--){
            for(int buy =0 ;buy<=1;buy++){
                for (int cap=1;cap<=k;cap++){
                    int profit = 0;
                    if (buy == 1) {
                        profit = Math.max(-prices[ind] + dp[ind+1][0][cap], dp[ind+1][1][cap]);
                    } else {
                        profit = Math.max(prices[ind] + dp[ind+1][1][cap-1], dp[ind+1][0][cap]);
                    }
                    dp[ind][buy][cap] = profit;
                }
            }
        }
        return dp[0][1][k];
    }

    public static int maxProfit_Help(int[] prices, int k) {
        int n = prices.length;
        int[][][] dp = new int[n][2][k+1];

        // Initialize the dp array with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <2; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return maxProfit_Mem(prices, 0, 1, dp, k);
    }

    public static void main(String[] args) {
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(maxProfit_Help(prices, 3));
        int[] prices1 = {1,2,3,4,5};
        System.out.println(maxProfit_Tab(prices1, 2));
    }
}
