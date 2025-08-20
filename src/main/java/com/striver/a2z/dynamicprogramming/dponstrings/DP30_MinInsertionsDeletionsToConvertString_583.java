package com.striver.a2z.dynamicprogramming.dponstrings;

public class DP30_MinInsertionsDeletionsToConvertString_583 {
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
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int lcs = longestCommonSubsequence_Tab(word1, word2);
        return (m-lcs)+(n-lcs);
    }

    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "etco";
        System.out.println(minDistance(str1, str2));
    }
}
