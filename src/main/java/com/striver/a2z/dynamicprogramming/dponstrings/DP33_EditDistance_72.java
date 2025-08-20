package com.striver.a2z.dynamicprogramming.dponstrings;

import java.util.Arrays;

public class DP33_EditDistance_72 {

    private static int minDistance_Rec(String word1, String word2, int i, int j) {
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(word1.charAt(i) == word2.charAt(j)){
            return minDistance_Rec(word1, word2, i-1, j-1);
        }
        int insertion = 1 + minDistance_Rec(word1, word2, i, j-1);
        int deletion = 1 + minDistance_Rec(word1, word2, i-1, j);
        int replace = 1+ minDistance_Rec(word1, word2, i-1, j-1);
        return Math.min(insertion, Math.min(deletion, replace));
    }

    private static int minDistance_Mem(String word1, String word2, int i, int j, int[][] dp) {
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = minDistance_Mem(word1, word2, i-1, j-1, dp);
        }
        int insertion = 1 +  minDistance_Mem(word1, word2, i, j-1, dp);
        int deletion = 1 + minDistance_Mem(word1, word2, i-1, j, dp);
        int replace = 1+ minDistance_Mem(word1, word2, i-1, j-1, dp);
        return dp[i][j] = Math.min(insertion, Math.min(deletion, replace));
    }

    private static int minDistance_Tab(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            dp[i][0] = i;
        }
        for(int i=1;i<=n;i++){
            dp[0][i] = i;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    int insertion = 1 + dp[i][j - 1];
                    int deletion = 1 + dp[i - 1][j];
                    int replace = 1 + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(insertion, Math.min(deletion, replace));
                }
            }
        }
        return dp[m][n];
    }

    public static int minDistance_Helper(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        for(int[] row :dp){
            Arrays.fill(row, -1);
        }
        return minDistance_Mem(word1, word2, m-1, n-1, dp);
    }

    public static void main(String[] args) {
        String s = "horse";
        String t = "ros";
        System.out.println(minDistance_Tab(s, t));
    }
}
