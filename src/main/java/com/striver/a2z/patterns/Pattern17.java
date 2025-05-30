package com.striver.a2z.patterns;

/**
 * For n = 5
 *     A
 *    ABA
 *   ABCBA
 *  ABCDCBA
 * ABCDEDCBA
 * -----
 * Key Logic :- Tweak the j value by decrementing 2
 */
public class Pattern17 {
    public static void printPattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            char j = 'A';
            for(; j<='A'+(n-i);j++){
                System.out.print(j);
            }
            j = (char) (j-2);
            for(;j>='A';j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
