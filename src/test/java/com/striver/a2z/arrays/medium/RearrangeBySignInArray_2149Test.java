package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RearrangeBySignInArray_2149Test {
    RearrangeBySignInArray_2149 r = new RearrangeBySignInArray_2149();

    @Test
    public void test1(){
        int[] arr = {39,-8,-28,46,-16,-21,-12,49,14,-46,22,9};
        int[] res = {39,-8,46,-28,49,-16,14,-21,22,-12,9,-46};
        Assert.assertEquals(Arrays.toString(res), Arrays.toString(r.rearrangeArray(arr)));
    }
}
