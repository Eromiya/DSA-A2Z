package com.striver.a2z.dynamicprogramming.dponsubsequences;

import java.util.Arrays;

public class DP16_PartitionSetInto2WithMinAbsDiff {

    // Memoization won't work for this problem !
    private static boolean isSubsetSum_Mem(int[] arr, int target, int ind, int[][] dp) {
        if (target ==0){
            return true;
        }
        if(ind ==0){
            return arr[ind]==target;
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

    public static int isSubsetSum_Helper(int[] arr) {
        int n= arr.length;
        int target=0;
        // total sum
        for (int j : arr) {
            target += j;
        }
        int[][] dp = new int[n][target+1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }
        isSubsetSum_Mem(arr, target, arr.length-1, dp);

        int minDiff =  Integer.MAX_VALUE;
        for(int i=0;i<=target/2;i++){
            if(dp[n-1][i]==1){
                int s1 = i;
                int s2 = target-i;
                minDiff =Math.min(minDiff, Math.abs(s1-s2));            }
        }
        return minDiff;
    }

    public static int isSubsetSum_Tab(int[] arr){
        int n= arr.length;
        int target=0;
        // total sum
        for (int j : arr) {
            target += j;
        }
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

        int minDiff =  Integer.MAX_VALUE;
        for(int i=0;i<=target/2;i++){
            if(dp[n-1][i]){
                int s1 = i;
                int s2 = target-i;
                minDiff =Math.min(minDiff, Math.abs(s1-s2));            }
        }
        return minDiff;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int k = 4;
        int n = arr.length;
        System.out.println(isSubsetSum_Tab(arr));
    }
}
