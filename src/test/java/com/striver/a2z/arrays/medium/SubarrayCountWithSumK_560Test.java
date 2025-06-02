package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

public class SubarrayCountWithSumK_560Test {
    SubarrayCountWithSumK_560 s = new SubarrayCountWithSumK_560();

    @Test
    public void test1(){
        int[] arr = {1,-1,0};
        Assert.assertEquals(3, s.countOfSubarray(arr, 0));
    }
}
