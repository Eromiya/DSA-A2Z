package com.striver.a2z.dynamicprogramming.dponsubsequences;

import java.util.Arrays;

public class DP14_SubsetSumEqualToTarget {

    private static boolean isSubsetSum_Rec(int[] arr, int target, int ind) {
        if (target ==0){
            return true;
        }
        if(ind ==0){
            return arr[ind]==target;
        }
        boolean notTaken = isSubsetSum_Rec(arr, target, ind-1);
        boolean taken = false;
        if(arr[ind]<=target){
            taken = isSubsetSum_Rec(arr, target-arr[ind], ind-1);
        }
        return notTaken||taken;
    }

    private static boolean isSubsetSum_Mem(int[] arr, int target, int ind, int[][] dp) {
        if (target ==0){
            return true;
        }
        if(dp[ind][target]!=-1){
            return dp[ind][target] != 0;
        }
        boolean notTaken = isSubsetSum_Mem(arr, target, ind-1, dp);
        boolean taken = false;
        if(arr[ind]<=target){
            taken = isSubsetSum_Mem(arr, target-arr[ind], ind-1, dp);
        }
        dp[ind][target] = notTaken||taken ? 1:0;
        return notTaken||taken;
    }

    public static boolean isSubsetSum_Helper(int[] arr, int target) {
        int n= arr.length;
        int[][] dp = new int[n][target+1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        return isSubsetSum_Mem(arr, target, arr.length-1, dp);
    }

    public static boolean isSubsetSum_Tab(int[] arr, int target){
        int n= arr.length;
        boolean[][] dp = new boolean[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0] = true;
        }
        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }
        for(int ind =1;ind<n;ind++) {
            for (int k = 0; k <= target; k++) {
                boolean notTaken = dp[ind - 1][k];
                boolean taken = false;
                if (arr[ind] <= k) {
                    taken = dp[ind - 1][k - arr[ind]];
                }
                dp[ind][k] = notTaken || taken;
            }
        }
        return dp[n-1][target];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 4;
        int n = arr.length;
        System.out.println(isSubsetSum_Tab(arr, k));
    }
}
