package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSum_1Test {
    TwoSum_1 t = new TwoSum_1();

    @Test
    public void test1(){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res = {1,0};
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(t.twoSum(arr, target)));
    }
}
