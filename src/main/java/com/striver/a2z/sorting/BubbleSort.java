package com.striver.a2z.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr){
        int n=arr.length;
        boolean swapped = false;
        for(int i=0;i<n-1 ;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr= {7,4,5,3,8,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
