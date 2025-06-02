package com.striver.a2z.arrays.medium;

import org.junit.Assert;
import org.junit.Test;

public class StockBuyAndSell_121Test {
    StockBuyAndSell_121 s = new StockBuyAndSell_121();

    @Test
    public void test1(){
        int[] arr = {7,1,5,3,7,0,4};
        Assert.assertEquals(6, s.stockBuyAndSell(arr));
    }
}
