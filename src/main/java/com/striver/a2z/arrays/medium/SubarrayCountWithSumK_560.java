package com.striver.a2z.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarrayCountWithSumK_560 {
    public int countOfSubarray(int[] nums, int k ){
        int count = 0;
        int prefixSum =0, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-k))
            {
                count+= map.get(prefixSum-k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);

        }
        return count;
    }
}
