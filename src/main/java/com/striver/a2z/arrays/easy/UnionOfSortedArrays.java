package com.striver.a2z.arrays.easy;

public class UnionOfSortedArrays {
    public int[] union(int[] a1, int[] a2){
        int n1 = a1.length;
        int n2 = a2.length;
        int[] newArr = new int[n1+n2];
        int i = 0, j=0, k=0;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                newArr[k++] = a1[i];
                i++;
            }
            else{
                newArr[k++] = a2[j];
                j++;
            }
        }
        while(i<n1){
            newArr[k++] = a1[i++];
        }
        while(j<n2){
            newArr[k++] = a2[j++];
        }
        return newArr;
    }
}
