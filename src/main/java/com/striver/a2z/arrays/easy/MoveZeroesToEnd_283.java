package com.striver.a2z.arrays.easy;

/**
 * Two Pointer technique
 *
 */
public class MoveZeroesToEnd_283 {
    public void moveZeroes(int[] nums){
        int j = 0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        while(j<=n-1){
            nums[j++] = 0;
        }
    }
}
