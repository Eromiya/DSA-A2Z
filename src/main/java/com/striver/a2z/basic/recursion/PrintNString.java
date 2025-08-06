package com.striver.a2z.basic.recursion;

public class PrintNString {
    static int n = 5;
    public static void print(){
        if(n == 0){
            return;
        }
        System.out.println("DSA");
        n--;
        print();
    }

    public static void main(String[] args) {
        print();
        printABC(5);
    }

    private static void printABC(int n) {
        if(n==0){
            return;
        }
        System.out.println("ABC");
        printABC(n-1);
    }

}
