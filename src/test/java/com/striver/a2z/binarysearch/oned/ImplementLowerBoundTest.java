package com.striver.a2z.binarysearch.oned;

import org.junit.Assert;
import org.junit.Test;

public class ImplementLowerBoundTest {
    ImplementLowerBound i = new ImplementLowerBound();

    @Test
    public void test1(){
        int[] arr = {2, 3, 7, 10, 11, 11, 25};
        int target = 9;
        Assert.assertEquals(3, i.lowerBound(arr, target));
    }
}
