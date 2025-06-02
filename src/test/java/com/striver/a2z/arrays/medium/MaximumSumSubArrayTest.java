package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSumSubArrayTest {
    MaximumSumSubArray m = new MaximumSumSubArray();

    @Test
    public void test1(){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(-1);
        list.add(2);
        list.add(1);
        Assert.assertEquals(list, m.maximumSubArraySum(arr));
    }
}
