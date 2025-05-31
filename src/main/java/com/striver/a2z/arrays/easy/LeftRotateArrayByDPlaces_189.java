package com.striver.a2z.arrays.easy;

/**
 * Input : nums = [1,2,3,4,5,6,7] , k=3
 * Output : [5,6,7,1,2,3,4]
 */
public class LeftRotateArrayByDPlaces_189 {
    public void rotateByD(int[] nums, int k){
        int n = nums.length;
        reverseArray(0, n-1, nums);
        reverseArray(0, k-1, nums);
        reverseArray(k, n-1, nums);
    }

    public void reverseArray(int s, int e, int[] nums){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}


