package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP8_UniquePaths_62 {
    // Recursion
    public static int solveUniquePaths(int i, int j){
        if(i==0 &&j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        int up = solveUniquePaths(i-1, j);
        int left = solveUniquePaths(i, j-1);
        return up+left;
    }

    //Memoization
    private static int solveUniquePaths_Mem(int i, int j, int[][] dp) {
        if(i==0 && j==0){
            return dp[0][0] = 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = solveUniquePaths_Mem(i-1, j, dp);
        int left = solveUniquePaths_Mem(i, j-1, dp);
        return dp[i][j] = up+left;
    }

    //Tabulation
    private static int solveUniquePaths_Tab(int m, int n, int[][] dp) {
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    dp[i][j] = 1;
                }
                else{
                    int up =0;
                    int left = 0;
                    if(i>0){
                        up = dp[i-1][j];
                    }
                    if(j>0){
                        left = dp[i][j-1];
                    }
                    dp[i][j] = up+left;
                }
            }
        }
        return dp[m][n];
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solveUniquePaths_Mem(m-1, n-1, dp);
    }


    public static void main(String[] args) {
        int m = 3, n =7;
        System.out.println(uniquePaths(m,n));
    }
}
