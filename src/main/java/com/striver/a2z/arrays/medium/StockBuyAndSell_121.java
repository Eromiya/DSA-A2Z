package com.striver.a2z.arrays.medium;

public class StockBuyAndSell_121 {
    public int stockBuyAndSell(int[] prices){
        int minSoFar = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }
}
