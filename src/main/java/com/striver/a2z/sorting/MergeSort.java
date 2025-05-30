package com.striver.a2z.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int low, int high, int[] arr){
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(low, mid, arr);
            mergeSort(mid+1, high, arr);
            merge(low, mid, high, arr);
        }
    }
    public static void merge(int low, int mid, int high, int[] arr){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i= low, j=0; j<n1;i++,j++){
            L[j] = arr[i];
        }
        for(int i= mid+1, j=0; j<n2;i++,j++){
            R[j] = arr[i];
        }
        int i = 0,j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr= {7,4,5,3,8,1};
        mergeSort(0,  arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
