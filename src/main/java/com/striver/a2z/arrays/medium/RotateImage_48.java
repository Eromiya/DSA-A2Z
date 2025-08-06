package com.striver.a2z.arrays.medium;

import java.util.*;

public class RotateImage_48 {
    // Optimsed Approach
    // 1. Transpose Matrix
    // 2. Reverse Each Rows
    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        transpose(matrix, m, n);
        reverseRows(matrix, m, n);
    }

    private static void transpose(int[][] matrix, int m, int n){
        for(int i=0;i<m;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverseRows(int[][] matrix, int m, int n){
        for(int i=0;i<m;i++){
            for(int j =0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    // Own Solution
    public static void rotate2(int[][] matrix) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++){
                list.add(matrix[i][j]);
            }
            map.put(i, list);
        }

        for (int j = n-1, p=0; j >= 0; j--, p++) {
            for (int i = 0, q=0 ; i<m; i++, q++) {
                matrix[i][j] = map.get(p).get(q);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);

        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
