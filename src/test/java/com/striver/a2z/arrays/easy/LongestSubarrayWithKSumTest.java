package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubarrayWithKSumTest {
    LongestSubarrayWithKSum l = new LongestSubarrayWithKSum();

    @Test
    public void test1(){
        int[] arr = {10,5,2,7,1,-10};
        Assert.assertEquals(6, l.longestSubarray(arr, 15));
    }
}
