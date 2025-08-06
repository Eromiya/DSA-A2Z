package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP2_ClimbingStairs_70 {

    //Recursion
    public static int climbStairs(int n) {
        int[] count = new int[1];
        climbingStairsRec1(count, n, 0);
        return count[0];
    }

    private static void climbingStairsRec1(int[] count, int n, int sum) {
        if(sum == n){
            count[0]+=1;
            return;
        }
        if(sum>n){
            return;
        }
        climbingStairsRec1(count, n, sum+1);
        climbingStairsRec1(count, n, sum+2);
    }

    // Recursion - Similar to Fibonacci approach
    private static int climbingStairsRec2(int n) {
        if (n == 0 || n == 1) return 1;
        return climbingStairsRec2(n - 1) + climbingStairsRec2(n - 2);
    }

    // DP - Memoization
    private static int climbingStairs_Mem(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return climbingStairsDPRec(n, dp);
    }

    private static int climbingStairsDPRec(int n, int[] dp) {
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n] ==-1) {
            dp[n] = climbingStairsDPRec(n - 1, dp) + climbingStairsDPRec(n - 2, dp);
        }
        return dp[n];
    }

    // Tabulation
    private static int climbingStairs_Tab(int n){
        int prev = 1, prevprev = 1;

        for(int i=2;i<=n;i++){
            int temp = prev + prevprev;
            prevprev = prev;
            prev = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        // Recursion
        int count = climbingStairs_Tab(2);
        System.out.println(count);
    }
}
