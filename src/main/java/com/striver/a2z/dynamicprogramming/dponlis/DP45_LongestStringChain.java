package com.striver.a2z.dynamicprogramming.dponlis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DP45_LongestStringChain {
    static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();
    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length() + 1) {
            return false;
        }

        int first = 0;
        int second = 0;

        while (first < s1.length()) {
            if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            } else {
                first++;
            }
        }

        return first == s1.length() && second == s2.length();
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
        List<String> w = Arrays.asList(words);
        w.sort(comp);

        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        int maxi =1;
        for (int i = 0; i <= n - 1; i++) {
            for (int prev_index = 0; prev_index <= i - 1; prev_index++) {
                if ( compare(w.get(i), w.get(prev_index))&& 1 + dp[prev_index] > dp[i]) {
                    dp[i] = 1 + dp[prev_index];
                }
            }
            if (dp[i] > maxi) {
                maxi = dp[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};

    }
}
