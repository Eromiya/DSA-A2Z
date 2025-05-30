package com.striver.a2z.basic.recursion;

public class PrintNNaturalNos {
    static int n=5;
    static int count = 1;
    public static void print(){
        if(count==n+1){
            return;
        }
        System.out.println(count);
        count++;
        print();
    }

    public static void main(String[] args) {
        n = 6;
        print();
    }
}
