package com.striver.a2z.dynamicprogramming.dponstrings;

import java.util.Arrays;

public class DP26_PrintLongestCommonSubsequence {

    private static int longestCommonSubsequence_Rec(String text1, String text2, int ind1, int ind2) {
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(text1.charAt(ind1) == text2.charAt(ind2)){
            return 1 + longestCommonSubsequence_Rec(text1, text2, ind1-1, ind2-1);
        }
        return Math.max(longestCommonSubsequence_Rec(text1, text2, ind1-1, ind2), longestCommonSubsequence_Rec(text1, text2, ind1, ind2-1));
    }

    private static int longestCommonSubsequence_Mem(String text1, String text2, int ind1, int ind2, int[][] dp) {
        if(ind1<0 || ind2<0){
            return 0;
        }
        if(dp[ind1][ind2]!=-1){
            return dp[ind1][ind2];
        }
        if(text1.charAt(ind1) == text2.charAt(ind2)){
            return dp[ind1][ind2] = 1 + longestCommonSubsequence_Mem(text1, text2, ind1-1, ind2-1, dp);
        }
        return dp[ind1][ind2] =  Math.max(longestCommonSubsequence_Mem(text1, text2, ind1-1, ind2, dp), longestCommonSubsequence_Mem(text1, text2, ind1, ind2-1, dp));
    }

    public static int longestCommonSubsequence_Helper(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return longestCommonSubsequence_Mem(text1, text2, text1.length()-1, text2.length()-1, dp);
    }

    private static String printLongestCommonSubsequence_Tab(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=n;i++){
            dp[0][i] = 0;
        }
        for(int i=0;i<=m;i++){
            dp[i][0] = 0;
        }
        for(int ind1=1;ind1<=m;ind1++) {
            for (int ind2 = 1; ind2 <= n; ind2++) {
                if (text1.charAt(ind1-1) == text2.charAt(ind2-1)) {
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                } else {
                    dp[ind1][ind2] = Math.max(dp[ind1-1][ind2], dp[ind1][ind2-1]);
                }
            }
        }
        // Logic to form Resultant Longest Common Subsequence using dp matrix
        int resLength = dp[m][n];
        char[] resStr = new char[resLength];
        Arrays.fill(resStr, '*');
        int p=m,q=n;
        int index = resLength-1;
        while(p>0 && q>0){
            if(text1.charAt(p-1) == text2.charAt(q-1)){
                resStr[index--] = text1.charAt(p-1);
                p--;
                q--;
            }
            else if(dp[p-1][q]>dp[p][q-1]){
                p--;
            }
            else{
                q--;
            }
        }
        return String.valueOf(resStr);
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(printLongestCommonSubsequence_Tab(str1, str2));
    }
}
