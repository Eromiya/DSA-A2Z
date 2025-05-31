package com.striver.a2z.arrays.easy;

/**
 *  Given an array nums containing n distinct numbers in the range [0, n],
 *  return the only number in the range that is missing from the array.
 *  Input: nums = [3,0,1]
 *  Output: 2
 *
 *  Algorithm :- Sum of n natural Numbers
 *  Status : Done
 */
public class MissingNumber_268 {
    public int findMissingNumber(int[] nums) {
        int n = nums.length;
        int sumOfN = (n*(n+1))/2;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return sumOfN - sum;
    }
}
