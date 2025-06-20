package com.striver.a2z.binarysearch.oned;

import org.junit.Assert;
import org.junit.Test;

public class CeilInSortedArrayTest {
    CeilInSortedArray f = new CeilInSortedArray();

    @Test
    public void test1(){
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        Assert.assertEquals(2, f.ceil(arr, 5));
    }

    @Test
    public void test2(){
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        Assert.assertEquals(-1  , f.ceil(arr, 20));
    }

    @Test
    public void test3(){
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        Assert.assertEquals(0, f.ceil(arr, 0));
    }
}
