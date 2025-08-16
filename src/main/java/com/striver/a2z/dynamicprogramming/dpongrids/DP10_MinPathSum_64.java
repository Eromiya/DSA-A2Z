package com.striver.a2z.dynamicprogramming.dpongrids;

import java.util.Arrays;

public class DP10_MinPathSum_64 {

    // Memoization
    private static int solveMinPathSum_Mem(int i, int j, int[][] grid, int[][] dp) {
        if(i==0 && j==0){
            return dp[i][j] = grid[i][j];
        }
        if(i<0 || j<0){
            return (int) Math.pow(10, 9);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int up = grid[i][j] + solveMinPathSum_Mem(i-1, j, grid, dp);
        int left = grid[i][j] + solveMinPathSum_Mem(i, j-1, grid, dp);
        return dp[i][j] = Math.min(up, left);
    }

    //Tabulation
    private static int solveMinPathSum_Tab(int m, int n, int[][] grid, int[][] dp) {
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    dp[i][j] = grid[i][j];
                }
                else{
                    int up = grid[i][j];
                    if (i > 0)
                        up += dp[i - 1][j]; // Add the value from above if it's not out of bounds
                    else
                        up += (int) Math.pow(10, 9); // Add a large value if out of bounds in the up direction

                    int left = grid[i][j];
                    if (j > 0)
                        left += dp[i][j - 1]; // Add the value from the left if it's not out of bounds
                    else
                        left += (int) Math.pow(10, 9);
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[m][n];
    }

    // Helper
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solveMinPathSum_Tab(m-1, n-1, grid, dp);
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
}
