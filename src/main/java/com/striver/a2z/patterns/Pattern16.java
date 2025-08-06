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

    public static void printPattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
