package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP5_HouseRobber_198 {
    //Recursion
    public static int maxSumOfNonAdjElements(int ind, int[] nums) {
        if (ind < 0) {
            return 0;
        }
        if (ind == 0) {
            return nums[ind];
        }
        int pick = nums[ind] + maxSumOfNonAdjElements(ind-2,nums);
        int notPick = maxSumOfNonAdjElements(ind-1, nums);

        return Math.max(pick, notPick);
    }

    //Memoization
    public static int maxSumOfNonAdjElements_Mem(int ind, int[] nums, int[] dp){
        if (ind < 0) {
            return 0;
        }
        if (ind == 0) {
            return dp[ind] = nums[ind];
        }
        int pick = nums[ind] + maxSumOfNonAdjElements_Mem(ind-2,nums, dp);
        int notPick = maxSumOfNonAdjElements_Mem(ind-1, nums, dp);

        return dp[ind] = Math.max(pick, notPick);
    }

    //Tabulation
    public static int maxSumOfNonAdjElements_Tab(int ind, int[] nums, int[] dp){
        dp[0] = nums[0];
        for(int i=1;i<ind;i++) {
            int pick = nums[i];
            if(i>1) {
                pick += dp[i - 2];
            }
            int notPick = dp[i-1];
            dp[i] = Math.max(pick, notPick);
        }
        return dp[ind-1];
    }

    public static int helper(int n, int[] nums){
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return maxSumOfNonAdjElements_Mem(n-1, nums, dp);
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1,3,5,8,1,9};
        System.out.println(helper(nums.length, nums));
        int[] height1 = {30, 20, 50, 10, 40};
        System.out.println(helper(height1.length, height1));
    }
//    public static int rob_Rec(int[] nums, int n) {
//        if(n>=nums.length){
//            return 0;
//        }
//        return nums[n] + rob_Rec(nums, n+2);
//    }
//    public static int rob(int[] nums) {
//       return Math.max(rob_Rec(nums, 0), rob_Rec(nums, 1));
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,1};
//        System.out.println(rob(nums));
//    }

}
