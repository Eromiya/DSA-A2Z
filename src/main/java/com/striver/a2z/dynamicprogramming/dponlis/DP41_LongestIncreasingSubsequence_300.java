package com.striver.a2z.dynamicprogramming.dponlis;

import java.util.Arrays;

public class DP41_LongestIncreasingSubsequence_300 {

    private static int lengthOfLIS_Rec(int[] nums, int ind, int prev) {
        if(ind==nums.length){
            return 0;
        }
        int notTake = lengthOfLIS_Rec(nums, ind+1, prev);
        int take =0;
        if(prev==-1|| nums[prev] < nums[ind]){
            take = 1+lengthOfLIS_Rec(nums, ind+1, ind);
        }
        return Math.max(take, notTake);
    }

    private static int lengthOfLIS_Mem(int[] nums, int ind, int prev, int[][] dp) {
        if(ind==nums.length){
            return 0;
        }
        if(dp[ind][prev+1]!=-1){
            return dp[ind][prev+1];
        }
        int notTake = lengthOfLIS_Mem(nums, ind+1, prev, dp);
        int take =0;
        if(prev==-1|| nums[prev] < nums[ind]){
            take = 1+lengthOfLIS_Mem(nums, ind+1, ind, dp);
        }
        return dp[ind][prev+1] = Math.max(take, notTake);
    }

    private static int lengthOfLIS_Tab(int[] nums) {
        int n= nums.length;

        int[][] dp = new int[n+1][n+1];
        for(int ind =n-1;ind >= 0;ind--){
            for(int prev =  ind-1;prev>=-1;prev--){
                int notTake = dp[ind+1][prev+1];
                int take =0;
                if(prev==-1|| nums[prev] < nums[ind]){
                    take = 1+dp[ind+1][ind+1];
                }
                dp[ind][prev+1] = Math.max(take, notTake);
            }
        }
        return dp[0][0];
    }


    public static int lengthOfLIS_Helper(int[] nums) {
        int n= nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
//        return lengthOfLIS_Mem(nums, 0, -1, dp);
        return  lengthOfLIS_Tab(nums);
    }


    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS_Helper(arr));
    }
}
