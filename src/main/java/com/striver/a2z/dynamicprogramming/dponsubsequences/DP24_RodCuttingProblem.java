package com.striver.a2z.dynamicprogramming.dponsubsequences;

import java.util.Arrays;

public class DP24_RodCuttingProblem {

    private static int rodCutting_Rec(int[] arr, int n, int ind) {
        if(ind==0){
            return n *arr[0];
        }
        int notTake = rodCutting_Rec(arr, n, ind-1);
        int take = Integer.MIN_VALUE;
        int rodLength = ind+1;
        if(n>=rodLength){
            take =  arr[ind] + rodCutting_Rec(arr, n-rodLength, ind);
        }
        return Math.max(take, notTake);
    }

    private static int rodCutting_Mem(int[] arr, int n, int ind, int[][] dp) {
        if(ind==0){
            return n *arr[0];
        }
        if(dp[ind][n]!=-1){
            return dp[ind][n];
        }
        int notTake = rodCutting_Mem(arr, n, ind-1, dp);
        int take = Integer.MIN_VALUE;
        int rodLength = ind+1;
        if(n>=rodLength){
            take =  arr[ind] + rodCutting_Mem(arr, n-rodLength, ind, dp);
        }
        return dp[ind][n] = Math.max(take, notTake);
    }

    private static int rodCutting_Tab(int[] price, int n){
        int[][] dp = new int[n][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i] = i*price[0];
        }
        for(int ind =1;ind<n;ind++){
            for(int l=0;l<=n;l++){
                int notTake = dp[ind-1][l];
                int take = Integer.MIN_VALUE;
                int rodLength = ind+1;
                if(l>=rodLength){
                    take =  price[ind] + dp[ind][l-rodLength];
                }
                dp[ind][l] = Math.max(take, notTake);
            }
        }
        return dp[n-1][n];
    }

    private static int rodCutting_Helper(int[] arr, int n) {
        int[][] dp = new int[n][n+1];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        return rodCutting_Mem(arr, n, n-1, dp);
    }


    public static void main(String[] args) {
        int arr[] = {1, 6, 8, 9, 10, 19, 7, 20};
        int n = 8;
        System.out.println(rodCutting_Tab(arr, n));
    }
}
