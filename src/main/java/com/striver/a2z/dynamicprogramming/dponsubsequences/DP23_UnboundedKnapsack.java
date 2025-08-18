package com.striver.a2z.dynamicprogramming.dponsubsequences;

import java.util.Arrays;

public class DP23_UnboundedKnapsack {
    public static int knapsack01_Rec(int[] wt, int[] val, int ind, int W) {
        if(ind==0){
            return ((int) (W / wt[0])) * val[0];
        }
        int notTake = knapsack01_Rec(wt, val, ind - 1, W);
        int take = Integer.MIN_VALUE;
        if (W - wt[ind] >= 0) {
            take = val[ind] + knapsack01_Rec(wt, val, ind , W - wt[ind]);
        }
        return Math.max(take, notTake);
    }
    public static int knapsack01_Mem(int[] wt, int[] val, int ind, int W, int[][] dp) {
        if(ind==0){
            return ((int) (W / wt[0])) * val[0];
        }
        if (dp[ind][W]!=-1){
            return dp[ind][W];
        }
        int notTake = knapsack01_Mem(wt, val, ind - 1, W, dp);
        int take = Integer.MIN_VALUE;
        if (W - wt[ind] >= 0) {
            take = val[ind] + knapsack01_Mem(wt, val, ind , W - wt[ind], dp);
        }
        return dp[ind][W] = Math.max(take, notTake);
    }

    public static int knapsack01_Tab(int[] wt, int[] val, int W) {
        int[][] dp = new int[wt.length][W+1];
        for (int w = wt[0];w<=W;w++){
            dp[0][w] = ((int) w / wt[0]) * val[0];
        }
        for (int ind =1;ind<wt.length;ind++){
            for (int w= 0;w<=W;w++){
                int notTake = dp[ind-1][w];
                int take = Integer.MIN_VALUE;
                if (w - wt[ind] >= 0) {
                    take = val[ind] + dp[ind][w-wt[ind]];
                }
                dp[ind][w] = Math.max(take, notTake);
            }
        }
        return dp[wt.length-1][W];

    }

    public static int knapsack01_Helper(int[] wt, int[] val, int W) {
        int[][] dp = new int[wt.length][W+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return knapsack01_Mem(wt, val, wt.length-1, W, dp);

    }

    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        //val = [60, 100, 120], wt = [10, 20, 30], W = 50
        System.out.println(knapsack01_Tab(wt, val, W));
    }
}
