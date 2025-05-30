package com.striver.a2z.patterns;

/**
 * For n = 5
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 * -----
 * Key Logic :- if eow num and colum num is either 1 or n
 */
public class Pattern21 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
