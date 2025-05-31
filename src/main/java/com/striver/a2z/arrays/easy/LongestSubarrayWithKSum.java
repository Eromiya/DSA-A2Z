package com.striver.a2z.arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithKSum {
    public int longestSubarray(int[] arr, int k){
            int longLen = 0, prefixSum = 0, n=arr.length;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                prefixSum +=arr[i];
                if(prefixSum == k){
                    longLen = i+1;
                }
                else if(map.containsKey(prefixSum-k)){
                    longLen = Math.max(longLen, i - map.get(prefixSum-k));
                }
                if(!map.containsKey(prefixSum)){
                    map.put(prefixSum, i);
                }
            }
            return longLen;
    }
}
