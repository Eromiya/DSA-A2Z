package com.striver.a2z.dynamicprogramming.dpongrids;

import java.util.Arrays;

public class DP12_MinMaxFallingPathSum_931 {
    public static void main(String[] args) {
        int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(minFallingPathSum_Mem(matrix));
    }
    public static int minFallingPathSum_Rec(int[][] matrix) {
        int n = matrix.length;
        int max = Integer.MAX_VALUE;
        for(int j=n-1;j>=0;j--){
            int ans = solveMinFallingPathSum_Rec(matrix, n-1 , j, n);
            max = Math.min(ans, max);
        }
        return max;
    }

    public static int solveMinFallingPathSum_Rec(int[][] matrix, int i, int j, int n) {
        if(j<0 || j>n-1){
            return (int) Math.pow(10, 9);
        }
        if(i==0){
            return matrix[0][j];
        }

        int up = matrix[i][j] + solveMinFallingPathSum_Rec(matrix, i-1, j, n);
        int leftDiagonal = matrix[i][j] + solveMinFallingPathSum_Rec(matrix, i-1, j-1, n);
        int rightDiagonal = matrix[i][j] + solveMinFallingPathSum_Rec(matrix, i-1, j+1, n);

        return Math.min(up, Math.min(leftDiagonal, rightDiagonal));
    }

    public static int minFallingPathSum_Mem(int[][] matrix) {
        int n = matrix.length;
        int min = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        for(int j=n-1;j>=0;j--){
            dp[n-1][j] = solveMinFallingPathSum_Mem(matrix, n-1 , j, n, dp);
            min = Math.min(dp[n-1][j], min);
        }
        return min;
    }

    public static int solveMinFallingPathSum_Mem(int[][] matrix, int i, int j, int n, int[][] dp) {
        if(j<0 || j>n-1){
            return (int) Math.pow(10, 9);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(i==0){
            return dp[i][j] = matrix[0][j];
        }

        int up = matrix[i][j] + solveMinFallingPathSum_Mem(matrix, i-1, j, n, dp);
        int leftDiagonal = matrix[i][j] + solveMinFallingPathSum_Mem(matrix, i-1, j-1, n, dp);
        int rightDiagonal = matrix[i][j] + solveMinFallingPathSum_Mem(matrix, i-1, j+1, n, dp);

        return dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
    }

    public static int minFallingPathSum_Tab(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int j = 0; j <= n - 1; j++) {
            dp[0][j] = matrix[0][j];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = matrix[i][j] + dp[i - 1][j];
                int leftDiagonal;
                if (j > 0) {
                    leftDiagonal = matrix[i][j] + dp[i - 1][j - 1];
                } else {
                    leftDiagonal = (int) Math.pow(10, 9);
                }
                int rightDiagonal;
                if (j < n - 1) {
                    rightDiagonal = matrix[i][j] + dp[i - 1][j + 1];
                } else {
                    rightDiagonal = (int) Math.pow(10, 9);
                }
                dp[i][j] = Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }
        return dp[m - 1][n - 1];
    }

}
