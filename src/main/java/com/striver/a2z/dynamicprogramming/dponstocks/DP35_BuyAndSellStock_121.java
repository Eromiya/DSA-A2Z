package com.striver.a2z.dynamicprogramming.dponstocks;

public class DP35_BuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
