package com.striver.a2z.basic.recursion;

public class PrintNTo1 {
    public static void print(int a, int n){
        if(a>n){
            return;
        }
        System.out.println(n);
        n--;
        print(a, n);
    }

    public static void main(String[] args) {
        int n = 6;
        print(1, n);
    }
}
