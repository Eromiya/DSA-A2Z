package com.striver.a2z.arrays.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckArraySortedRotated_1752Test {
    CheckArraySortedRotated_1752 check = new CheckArraySortedRotated_1752();

    @Test
    public void test1(){
        int[] arr = {1000, 10000, 100000, 10000001, 100};
        assertTrue(check.check(arr));
    }

    @Test
    public void test3(){
        int[] arr = { 10000001, 1000, 10000, 100000};
        assertTrue(check.check(arr));
    }


    @Test
    public void test2(){
        int[] arr = {10,3,5,6,77,0,100};
        assertFalse(check.check(arr));
    }
}
