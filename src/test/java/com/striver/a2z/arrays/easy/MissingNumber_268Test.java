package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber_268Test {
    MissingNumber_268 m = new MissingNumber_268();

    @Test
    public void test1(){
        int[] arr = {0,3,2};
        Assert.assertEquals(1, m.findMissingNumber(arr));
    }
}
