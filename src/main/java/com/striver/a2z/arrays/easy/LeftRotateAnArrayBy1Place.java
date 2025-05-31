package com.striver.a2z.arrays.easy;

public class LeftRotateAnArrayBy1Place {
    public void rotateBy1(int[] nums){
        int n= nums.length;
        int element = nums[nums.length-1];
        for(int i=n-1;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = element;
    }
}
