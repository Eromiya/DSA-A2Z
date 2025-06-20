package com.striver.a2z.contest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Q3MaximumProdOfFirstAndLast_MTest {
    Q3MaximumProdOfFirstAndLast_M q = new Q3MaximumProdOfFirstAndLast_M();

    @Test
    public void test1() {
        int[] arr = {-1, -9, 2, 3, -2, -3, 1};
        int m = 1;

        Assert.assertEquals(81, q.maximumProduct(arr, m));
    }

    @Test
    public void test2() {
        int[] arr = {1, 3, -5, 5, 6, -4};
        int m = 3;

        Assert.assertEquals(20, q.maximumProduct(arr, m));
    }
}