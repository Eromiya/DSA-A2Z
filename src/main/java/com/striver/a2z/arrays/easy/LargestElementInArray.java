package com.striver.a2z.arrays.easy;

public class LargestElementInArray {
    public int largest(int[] arr){
        int maxInd = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[maxInd] <= arr[i]){
                maxInd = i;
            }
        }
        return arr[maxInd];
    }
}
