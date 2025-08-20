package com.striver.a2z.dynamicprogramming.dponstrings;

import java.util.Arrays;

public class DP32_DistinctSubsequences_115 {
    private static int numDistinct_Rec(String s, String t, int i, int j) {
        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(s.charAt(i) == t.charAt(j)){
            return numDistinct_Rec(s, t, i-1, j-1) + numDistinct_Rec(s, t, i-1, j);
        }
        return numDistinct_Rec(s, t, i-1, j);
    }

    private static int numDistinct_Mem(String s, String t, int i, int j, int[][] dp) {
        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(s.charAt(i) == t.charAt(j)){
            return dp[i][j] = numDistinct_Mem(s, t, i-1, j-1, dp) + numDistinct_Mem(s, t, i-1, j, dp);
        }
        return dp[i][j] = numDistinct_Mem(s, t, i-1, j, dp);
    }

    public static int numDistinct_Helper(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return numDistinct_Mem(s, t, m-1, n-1, dp);
    }

    private static int numDistinct_Tab(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++) {
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp [i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }
        return dp[m][n];

    }

    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(numDistinct_Tab(s, t));
    }
}
