package com.striver.a2z.arrays.easy;

public class RemoveDuplicatesInSortedArray_26 {
    public int remove(int[] nums){
        int j=0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}
