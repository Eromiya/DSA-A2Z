package com.striver.a2z.patterns;

/**
 * For n = 5
 * *
 * **
 * ***
 * ****
 * *****
 * ****
 * ***
 * **
 * *
 * -----
 * Key Logic :- stars variable | divide the pattern into two and have two conditions for inner loop
 */
public class Pattern10 {
    public static void printPattern(int n){
        for(int i=1;i<=2*n-1;i++){
            int m = i;
            if(i>n){
                m = 2*n-i;
            }
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
