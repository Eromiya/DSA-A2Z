package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LeftRotateAnArrayBy1PlaceTest {
    LeftRotateAnArrayBy1Place l = new LeftRotateAnArrayBy1Place();

    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5,6};
        l.rotateBy1(arr);
        Assert.assertEquals("[6, 1, 2, 3, 4, 5]", Arrays.toString(arr));
    }
}
