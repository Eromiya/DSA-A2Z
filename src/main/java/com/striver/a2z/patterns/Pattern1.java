package com.striver.a2z.patterns;

/**
 * For n = 5
 * *****
 * *****
 * *****
 * *****
 * *****
 */
public class Pattern1 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
