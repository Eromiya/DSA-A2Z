package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class NextPermutation_31Test {
    NextPermutation_31 n = new NextPermutation_31();

    @Test
    public void test1(){
        int[] arr = {3,2,1};
        int[] res = {1,2,3};
        n.nextPermutation(arr);
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(arr));
    }
}
