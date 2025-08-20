package com.striver.a2z.dynamicprogramming.dponstrings;

public class DP27_LongestCommonSubstring {
    private static int longestCommonSubstring_Tab(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=0;i<=n;i++){
            dp[0][i] = 0;
        }
        for(int i=0;i<=m;i++){
            dp[i][0] = 0;
        }
        int ans =0;
        for(int ind1=1;ind1<=m;ind1++) {
            for (int ind2 = 1; ind2 <= n; ind2++) {
                if (text1.charAt(ind1-1) == text2.charAt(ind2-1)) {
                    dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
                    ans = Math.max(ans, dp[ind1][ind2]);
                } else {
                    dp[ind1][ind2] = 0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "abcjklp";
        String str2 = "acjkp";
        System.out.println(longestCommonSubstring_Tab(str1, str2));
    }
}
