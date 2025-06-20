package com.striver.a2z.binarysearch.oned;

import org.junit.Assert;
import org.junit.Test;

public class ImplementUpperBoundTest {
    ImplementUpperBound i = new ImplementUpperBound();

    @Test
    public void test1(){
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        Assert.assertEquals(3, i.upperBound(arr, target));
    }
    @Test
    public void test2(){
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 11;
        Assert.assertEquals(6, i.upperBound(arr, target));
    }
}
