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
    }
}
