package com.striver.a2z.arrays.medium;

public class NextPermutation_31 {
    public void nextPermutation(int[] nums) {
        int pivot =-1;
        int greater = -1, n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i+1] > nums[i]){
                pivot = i;
                break;
            }
        }

        // If pivot point does not exist, reverse the whole array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return ;
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i] > nums[pivot]){
                greater = i;
                break;
            }
        }

        swap(pivot, greater, nums);
        reverse(nums, pivot+1, n-1);
    }

    public void swap(int pivot, int greater, int[] nums){
        int temp = nums[pivot];
        nums[pivot] = nums[greater];
        nums[greater] = temp;
    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
