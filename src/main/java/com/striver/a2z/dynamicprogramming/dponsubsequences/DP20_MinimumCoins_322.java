package com.striver.a2z.dynamicprogramming.dponsubsequences;

import java.util.Arrays;

public class DP20_MinimumCoins_322 {
    public static int minimumCoins_Rec(int[] coins, int ind, int amount) {
        if(ind==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            return (int)1e9;
        }
        int notTake = minimumCoins_Rec(coins, ind - 1, amount);
        int take = (int)1e9;
        if (amount - coins[ind] >= 0) {
            take = 1 + minimumCoins_Rec(coins, ind, amount - coins[ind]);
        }
        return Math.min(take, notTake);
    }
    public static int minimumCoins_Mem(int[] coins, int ind, int amount, int[][] dp) {
        if (ind == 0) {
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            }
            return (int)1e9;
        }
        if (dp[ind][amount]!=-1)
            return dp[ind][amount];
        int notTake = minimumCoins_Rec(coins, ind - 1, amount);
        int take = (int)1e9;
        if (amount - coins[ind] >= 0) {
            take = 1 + minimumCoins_Rec(coins, ind, amount - coins[ind]);
        }
        return dp[ind][amount] = Math.min(take, notTake);
    }

    public static int minimumCoins_Tab(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount +1];
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0)
                dp[0][i] = i / coins[0];
            else
                dp[0][i] = (int) 1e9;
        }
        for (int ind = 1; ind< coins.length; ind++){
            for (int w = 0; w<= amount; w++){
                int notTake = dp[ind-1][w];
                int take = (int)1e9;
                if (w - coins[ind] >= 0) {
                    take = 1 + dp[ind][w- coins[ind]];
                }
                dp[ind][w] = Math.min(take, notTake);
            }
        }
        int res = dp[coins.length-1][amount];
        if(res>=(int)1e9){
            return -1;
        }
        return res;
    }

    public static int MinimumCoins_Helper(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return minimumCoins_Mem(coins, coins.length-1, amount, dp);

    }

    public static void main(String[] args) {
        int val[] = {1,2,3};
        int amt = 7;
        //val = [60, 100, 120], wt = [10, 20, 30], W = 50
        System.out.println(MinimumCoins_Helper(val, amt));
    }
}
