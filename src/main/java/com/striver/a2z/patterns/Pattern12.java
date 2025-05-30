package com.striver.a2z.patterns;

/**
 * For n = 5
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 */
public class Pattern12 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
