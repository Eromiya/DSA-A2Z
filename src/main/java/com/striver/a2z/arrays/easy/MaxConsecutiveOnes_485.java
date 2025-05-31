package com.striver.a2z.arrays.easy;

public class MaxConsecutiveOnes_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int n = nums.length;
        int max = -1;
        int j=0;
        for(;j<n;j++){
            if(nums[j]!=1){
                max = Math.max(max, j-i);
                i=j+1;
            }
        }
        return Math.max(max, j-i);
    }
}
