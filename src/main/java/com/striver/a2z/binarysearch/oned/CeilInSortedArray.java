package com.striver.a2z.binarysearch.oned;

public class CeilInSortedArray {
    public int ceil(int[] arr, int key){
        int low = 0, high = arr.length-1;
        int res = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] >= key){
                res = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return res;
    }
}
