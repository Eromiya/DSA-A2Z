package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LeftRotateArrayByDPlaces_189Test {
    LeftRotateArrayByDPlaces_189 l = new LeftRotateArrayByDPlaces_189();

    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5,6};
        l.rotateByD(arr, 1);
        Assert.assertEquals("[6, 1, 2, 3, 4, 5]", Arrays.toString(arr));
    }

    @Test
    public void test2(){
        int[] arr = {1,2,3,4,5,6};
        l.rotateByD(arr, 3);
        Assert.assertEquals("[4, 5, 6, 1, 2, 3]", Arrays.toString(arr));
    }
}
