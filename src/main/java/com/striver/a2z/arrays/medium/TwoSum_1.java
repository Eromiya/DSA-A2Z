package com.striver.a2z.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    public int[] twoSum(int[] arr, int target){
        int[] res = {-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(target-arr[i] , i);
            }
            else{
                res[0] = i;
                res[1] = map.get(arr[i]);
                return res;
            }
        }
        return res;
    }
}
