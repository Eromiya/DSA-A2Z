package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP3_FrogJump {
    //Recursion
    public static int calculateMinCost(int n, int[] height) {
        //Optimised
        if (n == 0) {
            return 0;
        }
        int jumpOne = calculateMinCost(n - 1, height) + Math.abs(height[n] - height[n - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (n > 1) {
            jumpTwo = calculateMinCost(n - 2, height) + Math.abs(height[n] - height[n - 2]);
        }

        return Math.min(jumpOne, jumpTwo);

//        if(n==1){
//            return 0;
//        }
//        if(n==2){
//            return Math.abs(height[n-1]-height[n-2]);
//        }
//        return Math.min(calculateMinCost(n-1, height) + Math.abs(height[n-1] - height[n-2]),
//                calculateMinCost(n-2, height) + Math.abs(height[n-1] - height[n-3]));
    }

    //Memoization
    public static int calculateMinCost_Mem(int n, int[] height, int[] dp){
        if (n == 0) {
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int jumpOne = calculateMinCost_Mem(n - 1, height, dp) + Math.abs(height[n] - height[n - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (n > 1) {
            jumpTwo = calculateMinCost_Mem(n - 2, height, dp) + Math.abs(height[n] - height[n - 2]);
        }
        return dp[n] = Math.min(jumpOne, jumpTwo);

//        if(n==1){
//            return 0;
//        }
//        if(n==2){
//            return Math.abs(height[n-1]-height[n-2]);
//        }
//        if(dp[n]!= -1){
//            return dp[n];
//        }
//
//        dp[n] = Math.min(calculateMinCost(n-1, height) + Math.abs(height[n-1] - height[n-2]),
//                calculateMinCost(n-2, height) + Math.abs(height[n-1] - height[n-3]));
//        return dp[n];
    }

    //Tabulation
    public static int calculateMinCost_Tab(int n, int[] height, int[] dp){
        dp[0] =0;

        for(int i=1;i<n;i++) {
            int jumpOne = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
            int jumpTwo = Integer.MAX_VALUE;
            if (i > 1) {
                jumpTwo = dp[i - 2] + Math.abs(height[i] - height[i - 2]);
            }
            dp[i] = Math.min(jumpOne, jumpTwo);
        }
        return dp[n-1];


//        if(n==1){
//            return 0;
//        }
//        dp[1] = 0;
//        dp[2] = Math.abs(height[n-1]-height[n-2]);
//        for(int i=3;i<=n;i++){
//            dp[i] = Math.min(calculateMinCost(i-1, height) + Math.abs(height[i-1] - height[i-2]),
//                    calculateMinCost(i-2, height) + Math.abs(height[i-1] - height[i-3]));
//        }
//        return dp[n];
    }

    public static int helper(int n, int[] height){
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return calculateMinCost_Tab(n, height, dp);
    }


    public static void main(String[] args) {
        int[] height = {20, 30, 40, 20};
        System.out.println(helper(height.length, height));
        int[] height1 = {30, 20, 50, 10, 40};
        System.out.println(helper(height1.length, height1));
    }
}
