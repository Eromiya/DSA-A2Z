package com.striver.a2z.arrays.easy;

/**
 * Find the index of the element in the given inout from an array
 */
public class LinearSearch {
    public int linearSearch(int[] arr, int key){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
