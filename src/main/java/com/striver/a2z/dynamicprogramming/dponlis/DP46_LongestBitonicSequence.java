package com.striver.a2z.dynamicprogramming.dponlis;

import java.util.Arrays;

public class DP46_LongestBitonicSequence {

    public static int longestBitonicSequence(int[] arr) {
        int n = arr.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        int[] bit = new int[n];
        Arrays.fill(dp1, 1);
        Arrays.fill(dp2, 1);
        for(int i =0;i<n;i++){
            for(int prev =0;prev<i;prev++){
                if (arr[prev] < arr[i] && 1 + dp1[prev] > dp1[i]) {
                    dp1[i] = 1 + dp1[prev];
                }
                if (arr[n-prev-1] < arr[n-i-1] && 1 + dp2[n-prev-1] > dp2[n-i-1]) {
                    dp2[n-1-i] = 1 + dp2[n-1-prev];
                }
            }
        }
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            bit[i] = dp1[i]+dp2[i]-1;
            if(maxi<bit[i]){
                maxi = bit[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1,11,2,10,4,5,2,1};
        System.out.println(longestBitonicSequence(arr));
    }
}
