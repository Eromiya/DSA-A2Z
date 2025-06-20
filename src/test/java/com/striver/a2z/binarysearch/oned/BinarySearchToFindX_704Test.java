package com.striver.a2z.binarysearch.oned;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchToFindX_704Test {
    BinarySearchToFindX_704 b = new BinarySearchToFindX_704();

    @Test
    public void test1(){
        int[] nums = {-1,0,3,5,9,12};
        Assert.assertEquals(-1, b.binarySearch(nums, 2));
    }

    @Test
    public void test2(){
        int[] nums = {-1,0,3,5,9,12};
        Assert.assertEquals(4, b.binarySearch(nums, 9));
    }
}
