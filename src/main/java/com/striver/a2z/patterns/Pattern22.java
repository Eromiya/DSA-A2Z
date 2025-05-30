package com.striver.a2z.patterns;

/**
 * For n = 5
 * 555555555
 * 544444445
 * 543333345
 * 543222345
 * 543212345
 * 543222345
 * 543333345
 * 544444445
 * 555555555
 * -----
 * Key Logic :- Yet to find
 */
public class Pattern22 {
    public static void printPattern(int n){
        // Outer loop for no. of rows
        for(int i=0;i<2*n-1;i++) {

            // inner loop for no. of columns.
            for (int j = 0; j < 2 * n - 1; j++) {

                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decreasing inside.
                System.out.print((n - Math.min(Math.min(top, bottom), Math.min(left, right))));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
