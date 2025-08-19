package com.striver.a2z.dynamicprogramming.dponlis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DP44_LargestDivisibleSubset_368 {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        int[] hash=new int[n];
        Arrays.fill(hash,1);

        for (int i = 0; i <= n - 1; i++) {
            hash[i] = i; // initializing with current index
            for (int j = 0; j <= i - 1; j++) {
                if ((nums[i] % nums[j] == 0) && 1 + dp[j] > dp[i]) {
                    dp[i] = 1 + dp[j];
                    hash[i] = j;
                }
            }
        }
        int ans = -1;
        int lastIndex =-1;
        for(int i=0; i<=n-1; i++){
            if(dp[i]> ans){
                ans = dp[i];
                lastIndex = i;
            }
        }
        res.add(nums[lastIndex]);
        while(hash[lastIndex] != lastIndex){ // till not reach the initialization value
            lastIndex = hash[lastIndex];
            res.add(nums[lastIndex]);
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,8};
        System.out.println(largestDivisibleSubset(nums));
    }
}
