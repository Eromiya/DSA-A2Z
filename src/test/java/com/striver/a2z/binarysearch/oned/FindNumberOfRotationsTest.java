package com.striver.a2z.binarysearch.oned;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberOfRotationsTest {
    FindNumberOfRotations f = new FindNumberOfRotations();

    @Test
    public void test1(){
        int[] nums = {15, 18, 2, 3, 6, 12};
        Assert.assertEquals(2, f.rotations(nums));
    }

    @Test
    public void test2(){
        int[] nums = {7, 9, 11, 12, 5};
        Assert.assertEquals(4, f.rotations(nums));
        Math.sqrt(1);
    }

    @Test
    public void test3(){
        int[] nums = {7, 9, 11, 12, 15};
        Assert.assertEquals(0, f.rotations(nums));
    }
}
