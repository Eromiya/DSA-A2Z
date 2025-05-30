package com.striver.a2z.patterns;

/**
 * For n = 5
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * -----
 * Key Logic :- Calculate stars and spaces before and after the hallway point i.e) n
 */
public class Pattern19 {
    public static void printPattern(int n){
        int count = n;
        for(int i=1;i<=2*n;i++){
            int stars = n-i+1;
            if(i>n){
                count--;
                stars = i-n;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;i<=n && j<2*i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;i>n && j<=(2*count);j++){
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

