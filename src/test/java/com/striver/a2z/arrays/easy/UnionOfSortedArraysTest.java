package com.striver.a2z.arrays.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UnionOfSortedArraysTest {
    UnionOfSortedArrays u = new UnionOfSortedArrays();

    @Test
    public void test1(){
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] out= u.union(arr1, arr2);
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        assertEquals(Arrays.toString(res), Arrays.toString(out));
    }
}
