package com.striver.a2z.arrays.medium;

/**
 * Given an array consisting of only 0s, 1s, and 2s.
 * Write a program to in-place sort the array without using inbuilt sort functions.
 * Input : nums = [2,0,2,1,1,0]
 * Output : [0,0,1,1,2,2]
 * Key Logic : Dutch-National Flag Alg
 */
public class SortColors0s1s2s_75 {
    public void sortColors(int[] nums) {
        int low =0, mid=0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid] ==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if (nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high --;
            }
        }
    }
}
