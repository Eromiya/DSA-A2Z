package com.striver.a2z.patterns;

/**
 * For n = 5
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
public class Pattern6 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printPattern1(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern1(5);
    }
}
