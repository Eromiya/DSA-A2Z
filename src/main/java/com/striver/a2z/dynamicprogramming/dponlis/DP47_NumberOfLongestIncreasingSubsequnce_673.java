package com.striver.a2z.dynamicprogramming.dponlis;

import java.util.Arrays;

public class DP47_NumberOfLongestIncreasingSubsequnce_673 {
    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] count = new int[n];
        Arrays.fill(count, 1);
        Arrays.fill(dp, 1);
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (nums[i] > nums[prev] && 1 + dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
                    count[i] = count[prev];
                } else if (nums[i] > nums[prev] && dp[prev] + 1 == dp[i]) {
                    count[i] = count[i] + count[prev];

                }
            }
            maxi = Math.max(dp[i], maxi);
        }
        //Calculate the number of maxi
        int nos = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] == maxi)
                nos += count[i];
        }
        return nos;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 4, 7};
        int[] nums = {1, 5, 4, 3, 2, 6, 7, 2};
        System.out.println(findNumberOfLIS(nums));
    }
}
