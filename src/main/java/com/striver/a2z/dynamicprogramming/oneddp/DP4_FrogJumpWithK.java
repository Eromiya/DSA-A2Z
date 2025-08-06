package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP4_FrogJumpWithK {
    //Recursion
    public static int calculateMinCost(int n, int[] height, int k) {
        if (n == 0) {
            return 0;
        }
        int minSteps = Integer.MAX_VALUE;

        for(int i=1; i<=k ;i++){
            if(n-i>=0) {
                int jump = calculateMinCost(n - i, height, k) + Math.abs(height[n] - height[n - i]);
                minSteps = Math.min(minSteps, jump);
            }
        }
        return minSteps;
    }

    //Memoization
    public static int calculateMinCost_Mem(int n, int[] height, int[] dp, int k){
        if (n == 0) {
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int minSteps = Integer.MAX_VALUE;

        for(int i=1; i<=k ;i++){
            if(n-i>=0) {
                int jump = calculateMinCost_Mem(n - i, height, dp, k) + Math.abs(height[n] - height[n - i]);
                minSteps = Math.min(minSteps, jump);
            }
        }
        return dp[n] = minSteps;
    }

    //Tabulation
    public static int calculateMinCost_Tab(int n, int[] height, int[] dp, int k){
        dp[0] =0;
        for(int i=1;i<n;i++) {
            int minSteps = Integer.MAX_VALUE;
            for (int j=1;j<=k;j++)
            {
                if(i-j>=0) {
                    int jump = dp[i - j] + Math.abs(height[i] - height[i - j]);
                    minSteps = Math.min(minSteps, jump);
                }
            }
            dp[i] = minSteps;
        }
        return dp[n-1];
    }

    public static int helper(int n, int[] height, int k){
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return calculateMinCost_Tab(n, height, dp, k);
    }


    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};
        System.out.println(helper(height.length, height, 2));
        int[] height1 = {30, 20, 50, 10, 40};
        System.out.println(helper(height1.length, height1, 3));
    }
}
