package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubArraySumKadane_53Test {
    MaximumSubArraySumKadane_53 m = new MaximumSubArraySumKadane_53();

    @Test
    public void test1(){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Assert.assertEquals(6, m.maximumSum(arr));
    }
}
