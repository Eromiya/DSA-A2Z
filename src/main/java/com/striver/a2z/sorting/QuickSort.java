package com.striver.a2z.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int low, int high, int[] arr){
        if(low < high) {
            int pivot = partition(low, high, arr);
            quickSort(low, pivot-1, arr);
            quickSort(pivot+1, high, arr);
        }
    }

    private static int partition(int low, int high, int[] arr) {
        int i=low-1;
        int j =low;
        int pivot = high;

        while(j<=high-1) {
            if (arr[j] < arr[pivot]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        int temp = arr[pivot];
        arr[pivot] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr= {7,4,5,3,8,1};
        quickSort(0,  arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
