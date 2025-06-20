package com.striver.a2z.binarysearch.oned;

public class FindNumberOfRotations {
    public int rotations(int[] nums) {
        int low =0, high = nums.length-1;

        while(low<high){
            int mid = low+(high - low)/2;

            if(nums[mid]> nums[high]){
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}
