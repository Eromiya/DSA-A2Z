package com.striver.a2z.patterns;

/**
 * For n = 5
 * A
 * BB
 * CCC
 * DDDD
 * EEEEE
 * -----
 * Key Logic :- 2 char loops
 */
public class Pattern16 {
    public static void printPattern(int n){
        for(char ch = 'A';ch<'A'+n;ch++){
            for(char j = 'A';j<=ch;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
