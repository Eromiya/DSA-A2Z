package com.striver.a2z.basic.recursion;

public class Print1ToN {
    public static void print(int a, int n){
        if(a>n){
            return;
        }
        System.out.println(a);
        a++;
        print(a, n);
    }

    public static void main(String[] args) {
        int n = 6;
        print(1, 100);
        print1ToN(n);
    }

    private static void print1ToN(int n) {
        if(n==0){
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
    }
}
