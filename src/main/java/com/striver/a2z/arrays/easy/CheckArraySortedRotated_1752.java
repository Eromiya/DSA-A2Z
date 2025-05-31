package com.striver.a2z.arrays.easy;

/**
 *
 * Check if Array is Rotated Sorted
 * Input: nums = [3, 4, 5, 1, 2]
 * Output: true
 *
 * Status: Done
 *
 * Alg :
 * 1. Initialize count = 0
 *
 * 2. Loop through array i = 0 to n - 1:
 *
 *      If nums[i] > nums[(i + 1) % n], increment count
 *
 * 3. Return true if count ≤ 1, else false
 */
public class CheckArraySortedRotated_1752 {
    public boolean check(int[] nums) {
        int count = 0;
        int n= nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}
