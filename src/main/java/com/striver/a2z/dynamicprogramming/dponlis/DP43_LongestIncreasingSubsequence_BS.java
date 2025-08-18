package com.striver.a2z.dynamicprogramming.dponlis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DP43_LongestIncreasingSubsequence_BS {
    // Binary Search since we need only length
    private static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        for(int i=0;i<n;i++){
            if(temp.get(temp.size()-1) < nums[i]){
                temp.add(nums[i]);
            }
            else{
                int ind = Collections.binarySearch(temp, nums[i]);
                if(ind<0){
                    ind= -ind-1;
                }
                temp.set(ind, nums[i]);
            }
        }
        return temp.size();
    }
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(arr));
    }
}
