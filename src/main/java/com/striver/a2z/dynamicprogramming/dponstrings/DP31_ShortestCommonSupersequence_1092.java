package com.striver.a2z.dynamicprogramming.dponstrings;

import java.util.Arrays;

public class DP31_ShortestCommonSupersequence_1092 {
    public static String shortestCommonSupersequence(String text1, String text2) {
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
        // Logic to form Shortest Common Supersequence using dp matrix
        int resLength = dp[m][n];
        StringBuilder resStr = new StringBuilder();

        int p=m,q=n;
        int index = resLength-1;
        while(p>0 && q>0){
            if(text1.charAt(p-1) == text2.charAt(q-1)){
                resStr.append(text1.charAt(p-1));
                index--;
                p--;
                q--;
            }
            else if(dp[p-1][q]>dp[p][q-1]){
                resStr.append(text1.charAt(p-1));
                index--;
                p--;
            }
            else{
                resStr.append(text2.charAt(q-1));
                index--;
                q--;
            }
        }
        while(p>0){
            resStr.append(text1.charAt(p-1));
            p--;
        }
        while(q>0){
            resStr.append(text2.charAt(q-1));
            q--;
        }
        return resStr.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "abac";
        String str2 = "cab";
        System.out.println(shortestCommonSupersequence(str1, str2));
    }
}
