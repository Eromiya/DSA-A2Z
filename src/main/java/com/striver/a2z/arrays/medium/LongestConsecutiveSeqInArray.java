package com.striver.a2z.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeqInArray {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxCount = 0;
        int currentStreak =0;
        for(int ele: set){
            currentStreak =0;
            if(!set.contains(ele-1)){
                currentStreak++;
                int itr = ele;
                while(set.contains(itr+1)){
                    currentStreak++;
                    itr++;
                }
                maxCount = Math.max(maxCount, currentStreak);
            }
        }
        return maxCount;
    }
}
