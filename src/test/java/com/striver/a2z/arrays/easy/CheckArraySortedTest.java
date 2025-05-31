package com.striver.a2z.arrays.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckArraySortedTest {
    CheckArraySorted check = new CheckArraySorted();

    @Test
    public void test1(){
        int[] arr = {1000, 10000, 100000, 10000001};
        assertTrue(check.check(arr));
    }

    @Test
    public void test2(){
        int[] arr = {10,3,5,6,77,0,100};
        assertFalse(check.check(arr));
    }
}
