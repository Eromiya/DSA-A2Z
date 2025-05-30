package com.striver.a2z.patterns;

/**
 * For n = 5
 * 1
 * 01
 * 101
 * 0101
 * 10101
 * -----
 * Key Logic :- m = 1-m
 */
public class Pattern11 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            int m=1;
            if(i%2==0){
                m=0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(m);
                m = 1-m;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
