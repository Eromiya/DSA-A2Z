package com.striver.a2z.arrays.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesInSortedArray_26Test {
    RemoveDuplicatesInSortedArray_26 rem  = new RemoveDuplicatesInSortedArray_26();

    @Test
    public void test1(){
        int[] arr = {1,1,2,3,3};
        assertEquals(3, rem.remove(arr));
    }

    @Test
    public void test2(){
        int[] arr = {1,2,3};
        assertEquals(3, rem.remove(arr));
    }
}
