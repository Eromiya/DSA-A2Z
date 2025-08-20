package com.striver.a2z.dynamicprogramming.dponstrings;

import java.util.Arrays;

public class DP29_MinInsertionsToMakeStringPalindrome_1312 {
    private static int longestCommonSubsequence_Tab(String text1, String text2) {
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
        return dp[m][n];
    }
    public static int longestPalindromeSubseq(String str1) {
        String str2 = new StringBuilder(str1).reverse().toString();
        return longestCommonSubsequence_Tab(str1, str2);
    }

    public static int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq(s);
    }

    public static void main(String[] args) {
        String str1 = "zzazz";

        System.out.println(minInsertions(str1));
    }
}
