package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP9_UniquePaths2_63 {
    // Recursion
    public static int solveUniquePaths(int i, int j, int[][] obstacleGrid){
        if(i>=0 && j>=0 && obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==0 &&j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        int up = solveUniquePaths(i-1, j, obstacleGrid);
        int left = solveUniquePaths(i, j-1, obstacleGrid);
        return up+left;
    }

    //Memoization
    private static int solveUniquePaths_Mem(int i, int j, int[][] dp, int[][] obstacleGrid) {
        if(i>=0 && j>=0 && obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==0 && j==0){
            return dp[0][0] = 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = solveUniquePaths_Mem(i-1, j, dp, obstacleGrid);
        int left = solveUniquePaths_Mem(i, j-1, dp, obstacleGrid);
        return dp[i][j] = up+left;
    }

    //Tabulation
    private static int solveUniquePaths_Tab(int m, int n, int[][] dp, int[][] obstacleGrid) {
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i>=0 && j>=0 && obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                }
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

    public static int uniquePaths2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solveUniquePaths_Mem(m-1, n-1, dp, obstacleGrid);
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePaths2(obstacleGrid));
    }
}
