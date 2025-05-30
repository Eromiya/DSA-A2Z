package com.striver.a2z.patterns;

/**
 * For n = 5
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * -----
 * Key Logic :- Calculate stars and spaces before and after the hallway point i.e) n
 */
public class Pattern20 {
    public static void printPattern(int n){
        int count = n-1;
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n){
                stars = count;
                count--;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;i<=n && j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;i>n && j<(2*(n-count))-1;j++){
                System.out.print(" ");
            }
            for(int j=stars;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}

