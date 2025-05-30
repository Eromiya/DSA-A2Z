package com.striver.a2z.patterns;

/**
 * For n = 5
 * E
 * DE
 * CDE
 * BCDE
 * ABCDE
 * -----
 * Key Logic :- Initialize character with n and i --> ('A'+n-i)
 */
public class Pattern18 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
            char ch = (char) ('A'+n-i);
            for(int j = 1;j<=i;j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
