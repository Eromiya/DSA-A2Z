package com.striver.a2z.arrays.easy;

public class SecondLargestElementWithoutSorting {
    public int secondLargest(int[] arr){
        int first = -1;
        int second = -1;
        for (int j : arr) {
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second && j != first) {
                second = j;
            }
        }
        return second;
    }
}
