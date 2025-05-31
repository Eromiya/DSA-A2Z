package com.striver.a2z.arrays.easy;

public class CheckArraySorted {
    public boolean check(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
