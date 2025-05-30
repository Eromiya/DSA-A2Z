package com.striver.a2z.patterns;

/**
 * For n = 5
 * ABCDE
 * ABCD
 * ABC
 * AB
 * A
 * -----
 * Key Logic :- 1 inner char loop
 */
public class Pattern15 {
    public static void printPattern(int n){
        for(int i=n;i>=1;i--){
            for(char ch = 'A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
