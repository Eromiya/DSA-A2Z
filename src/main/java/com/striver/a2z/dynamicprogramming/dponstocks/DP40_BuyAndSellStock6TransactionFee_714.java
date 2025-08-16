package com.striver.a2z.dynamicprogramming.dponstocks;

import java.util.Arrays;

public class DP40_BuyAndSellStock6TransactionFee_714 {
    public static int maxProfit_Rec(int[] prices, int fee, int ind, int buy) {
        if(ind >=prices.length){
            return 0;
        }
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[ind] + maxProfit_Rec(prices, fee, ind + 1, 0), maxProfit_Rec(prices, fee, ind + 1, 1));
        } else {
            profit = Math.max(prices[ind]-fee + maxProfit_Rec(prices, fee, ind + 1, 1), maxProfit_Rec(prices, fee, ind + 1, 0));
        }
        return  profit;
    }

    public static int maxProfit_Mem(int[] prices, int fee, int ind, int buy, int[][] dp) {
        if(ind >=prices.length){
            return 0;
        }
        if(dp[ind][buy]!=-1){
            return dp[ind][buy];
        }
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[ind] + maxProfit_Mem(prices, fee, ind + 1, 0, dp), maxProfit_Mem(prices, fee, ind + 1, 1, dp));
        } else {
            profit = Math.max(prices[ind]-fee + maxProfit_Mem(prices, fee, ind + 1, 1, dp), maxProfit_Mem(prices, fee, ind + 1, 0, dp));
        }
        return  dp[ind][buy] = profit;
    }

    public static int maxProfit_Tab(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n+1][2];
        dp[n][0] = dp[n][1] = 0;
        for(int ind= n-1;ind>=0;ind--){
            for(int buy =0 ;buy<=1;buy++){
                int profit = 0;
                if (buy == 1) {
                    profit = Math.max(-prices[ind] + dp[ind+1][0], dp[ind+1][1]);
                } else {
                    profit = Math.max(prices[ind]-fee + dp[ind+1][1], dp[ind+1][0]);
                }
                dp[ind][buy] = profit;
            }
        }
        return dp[0][1];
    }

    public static int maxProfit_Help(int[] prices, int fee) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return maxProfit_Mem(prices, fee, 0, 1, dp);
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit_Help(prices, 2));
        int[] prices1 = {1,2,3,4,5};
        System.out.println(maxProfit_Help(prices1, 1));
    }
}
