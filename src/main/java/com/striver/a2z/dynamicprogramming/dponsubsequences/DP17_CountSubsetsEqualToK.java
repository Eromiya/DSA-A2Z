package com.striver.a2z.dynamicprogramming.dponsubsequences;

import java.util.Arrays;

public class DP17_CountSubsetsEqualToK {
    static int MOD = (int)1e9 + 7;
    private static int isSubsetSum_Rec(int[] arr, int target, int ind) {
        if(ind == 0){
            return arr[ind]==target ? 1 : 0;
        }
        if (target ==0){
            return 1;
        }
        int notTaken = isSubsetSum_Rec(arr, target, ind-1);
        int taken = 0;
        if(arr[ind]<=target){
            taken = isSubsetSum_Rec(arr, target-arr[ind], ind-1);
        }
        return (notTaken + taken) % MOD;
    }

    private static int isSubsetSum_Mem(int[] arr, int target, int ind, int[][] dp) {
        if (target ==0){
            return 1;
        }
        if(ind ==0){
            return arr[ind]==target ? 1: 0;
        }

        if(dp[ind][target]!=-1){
            return dp[ind][target];
        }
        int notTaken = isSubsetSum_Mem(arr, target, ind-1, dp);
        int taken = 0;
        if(arr[ind]<=target){
            taken = isSubsetSum_Mem(arr, target-arr[ind], ind-1, dp);
        }

        return  dp[ind][target] = (notTaken + taken) % MOD ;
    }

    public static int isSubsetSum_Helper(int[] arr, int target) {
        int n= arr.length;
        int[][] dp = new int[n][target+1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return isSubsetSum_Mem(arr, target, arr.length-1, dp);
    }

    public static int isSubsetSum_Tab(int[] arr, int target){
        int n= arr.length;
        int[][] dp = new int[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0] = 1;
        }
        if (arr[0] <= target) {
            dp[0][arr[0]] = 1;
        }
        for(int ind =1;ind<n;ind++) {
            for (int k = 0; k <= target; k++) {
                int notTaken = dp[ind - 1][k];
                int taken = 0;
                if (arr[ind] <= k) {
                    taken = dp[ind - 1][k - arr[ind]];
                }
                dp[ind][k] =( notTaken + taken) % MOD;
            }
        }
        return dp[n-1][target];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 4;
        int n = arr.length;
        System.out.println(isSubsetSum_Helper(arr, k));
    }
}
