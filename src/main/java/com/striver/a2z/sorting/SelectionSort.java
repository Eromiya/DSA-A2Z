package com.striver.a2z.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minInd = i;
            for(int j=i+1;j<n;j++){
                if(arr[minInd] > arr[j]){
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr= {7,4,5,3,8,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
