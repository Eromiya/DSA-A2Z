package com.striver.a2z.basic.recursion;

public class SumOfFirstNNos {
    public static int print(int n){
        if(n<=1){
            return n;
        }
        return n + print(n-1);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(print(n));
    }
}
