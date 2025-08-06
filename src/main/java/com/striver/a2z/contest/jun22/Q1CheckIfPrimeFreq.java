package com.striver.a2z.contest.jun22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q1CheckIfPrimeFreq {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        return checkIfPrime(new ArrayList<>(map.values()));
    }

    public boolean checkIfPrime(List<Integer> values){
        for(Integer val : values){
            if(val == 2 || val ==3){
                return true;
            }
            if(val%2==0 || val%3==0){
                continue;
            }
            for(int i=5;i*i<=val;i++){
                if(val%i==0){
                    return true;
                }
            }
        }
        return false;
    }
}
