package com.striver.a2z.dynamicprogramming.dponstrings;

import java.util.Arrays;

public class DP34_WildcardMatching_44 {

    private static boolean isMatch_Rec(String s, String t, int i, int j) {
        if(i<0 && j<0){
            return true;
        }
        else if(j<0){
            return false;
        }
        else if(i<0){
            for(int k=0;k<=j;k++){
                if(t.charAt(k)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(s.charAt(i) == t.charAt(j) || t.charAt(j) == '?'){
            return isMatch_Rec(s, t, i-1, j-1);
        }
        else {
            if(t.charAt(j) == '*'){
                return isMatch_Rec(s, t, i-1, j) || isMatch_Rec(s, t, i, j-1);
            }
            return false;
        }
    }

    private static int isMatch_Mem(String s, String t, int i, int j, int[][] dp) {
        if(i<0 && j<0){
            return 1;
        }
        else if(j<0){
            return 0;
        }
        else if(i<0){
            for(int k=0;k<=j;k++){
                if(t.charAt(k)!='*'){
                    return 0;
                }
            }
            return 1;
        }
        if(s.charAt(i) == t.charAt(j) || t.charAt(j) == '?'){
            return dp[i][j] =  isMatch_Mem(s, t, i-1, j-1, dp);
        }
        else {
            if(t.charAt(j) == '*'){
                return dp[i][j] =  (isMatch_Mem(s, t, i-1, j, dp) == 1) || (isMatch_Mem(s, t, i, j-1, dp)==1) ? 1 : 0;
            }
            return 0;
        }
    }

    private static boolean isMatch_Tab(String s, String t) {
        int m = s.length(), n= t.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int i=1;i<=m;i++){
            dp[i][0] =false;
        }
        for(int i=1;i<=n;i++){
            dp[0][i] = isAllStars(t, i);
        }
        for(int i=1;i<=m;i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i-1) == t.charAt(j-1) || t.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    if (t.charAt(j-1) == '*') {
                        dp[i][j] = dp[i-1][j] || dp[i][j-1];
                    }
                    else{
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[m][n];
    }
    public static boolean isAllStars(String t, int ind){
        for(int k=1;k<=ind;k++){
            if(t.charAt(k-1)!='*'){
                return false;
            }
        }
        return true;
    }

    private static boolean isMatch_Helper(String s, String t) {
        int m = s.length(), n= t.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return isMatch_Mem(s, t, m - 1, n - 1, dp) == 1;
    }

    public static void main(String[] args) {
        String s = "aa";
        String t = "*";
        System.out.println(isMatch_Tab(s, t));
    }
}
