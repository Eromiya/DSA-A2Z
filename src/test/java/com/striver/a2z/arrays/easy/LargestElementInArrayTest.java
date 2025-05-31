package com.striver.a2z.arrays.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestElementInArrayTest {
    LargestElementInArray lar = new LargestElementInArray();

    @Test
    public void test1(){
        int[] arr = {10,3,5,6,77,0,100};
        assertEquals(100, lar.largest(arr));
    }
}
