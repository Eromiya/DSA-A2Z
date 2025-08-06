package com.striver.a2z.patterns;

/**
 * For n = 5
 *  *********
 *   *******
 *    *****
 *     ***
 *      *
 * -----
 * Key Logic :- Calculate for spaces and print '*' | End condition - 2*(n-i)+1
 */
public class Pattern8 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(n-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(n-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern1(5);
    }
}
