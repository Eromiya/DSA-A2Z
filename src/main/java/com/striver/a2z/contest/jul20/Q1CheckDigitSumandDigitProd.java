package com.striver.a2z.contest.jul20;

public class Q1CheckDigitSumandDigitProd {
    public static boolean checkDivisibility(int n) {
        int sum = 0, prod =1;
        char[] arr = String.valueOf(n).toCharArray();
        for(int i=0;i<arr.length;i++){
            sum += (arr[i]-'0');
            prod *= (arr[i]-'0');
        }
        return n % (sum+prod) == 0;

    }

    public static void main(String[] args) {
        System.out.println(checkDivisibility(99));
    }
}
