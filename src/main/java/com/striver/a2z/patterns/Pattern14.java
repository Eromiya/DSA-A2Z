package com.striver.a2z.patterns;

/**
 * For n = 5
 * A
 * AB
 * ABC
 * ABCD
 * ABCDE
 * -----
 * Key Logic :- 1 inner char loop
 * */
public class Pattern14 {
    public static void printPattern(int n){
        for(int i=1;i<=n;i++){
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
