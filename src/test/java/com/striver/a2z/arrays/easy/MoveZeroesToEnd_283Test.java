package com.striver.a2z.arrays.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MoveZeroesToEnd_283Test {
    MoveZeroesToEnd_283 m = new MoveZeroesToEnd_283();

    @Test
    public void test1(){
        int[] arr = {1,0,3,0,5,0};
        m.moveZeroes(arr);
        Assert.assertEquals("[1, 3, 5, 0, 0, 0]", Arrays.toString(arr));
    }
}
