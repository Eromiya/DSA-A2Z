package com.striver.a2z.arrays.easy;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInAnArray {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int max = arr[n-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
