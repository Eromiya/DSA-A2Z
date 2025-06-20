package com.striver.a2z.binarysearch.oned;

public class ImplementLowerBound {
    public int lowerBound(int[] arr, int target){
        int low = 0, high = arr.length-1;
        int res = arr.length;
        while (low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=target){
                res = mid;
               high = mid -1;
            }
            else {
               low = mid +1;
            }
        }
        return res;
    }
}
