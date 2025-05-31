package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnes_485Test {
    MaxConsecutiveOnes_485 m = new MaxConsecutiveOnes_485();

    @Test
    public void test1(){
        int[] arr = {1,1,1,0,1,1};
        Assert.assertEquals(3, m.findMaxConsecutiveOnes(arr));
    }

    @Test
    public void test2(){
        int[] arr = {1,1,1,0,1,1,1,1,1,1,1,1,1,1,1};
        Assert.assertEquals(11, m.findMaxConsecutiveOnes(arr));
    }
}
