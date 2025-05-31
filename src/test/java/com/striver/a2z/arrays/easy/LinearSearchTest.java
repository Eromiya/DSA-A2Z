package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class LinearSearchTest {
    LinearSearch l = new LinearSearch();

    @Test
    public void test1(){
        int[] arr = {10,3,5,6,77,0,100};
        Assert.assertEquals(6, l.linearSearch(arr, 100));
    }

    @Test
    public void test2(){
        int[] arr = {10,3,5,6,77,0,100};
        Assert.assertEquals(-1, l.linearSearch(arr, 10000));
    }
}
