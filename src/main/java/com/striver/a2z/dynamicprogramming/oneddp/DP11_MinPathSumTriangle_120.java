package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP11_MinPathSumTriangle_120 {
    public static int minimumTotal_own(List<List<Integer>> triangle) {
        int m= triangle.size();
        int maxN = triangle.get(m-1).size();
        int[][] dp = new int[maxN+1][maxN+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solveMinimumTotal_own(triangle, m-1, maxN, maxN, dp);
    }

    public static int solveMinimumTotal_own(List<List<Integer>> triangle, int row, int last, int defaultLast, int[][] dp){
        int minTotal = Integer.MAX_VALUE;
        if(last!= defaultLast && last>triangle.get(row).size()){
            return (int) Math.pow(10, 9);
        }
        if(dp[row][last]!=-1){
            return dp[row][last];
        }
        if(row == 0){
            return dp[0][0] = triangle.get(0).get(0);
        }
        else{
            int n = triangle.get(row).size();
            for(int i=0;i<n;i++){
                if(i==last || i==last-1 || last == defaultLast){
                    int currTotal = triangle.get(row).get(i) + solveMinimumTotal_own(triangle, row-1, i, defaultLast, dp);
                    minTotal = Math.min(minTotal, currTotal);
                }
            }
            return dp[row][last] = minTotal;
        }
    }

    public static void main(String[] args) {
//        List<List<Integer>> triangle = new ArrayList<>();
//        triangle.add(List.of(2));
//        triangle.add(Arrays.asList(3, 4));
//        triangle.add(Arrays.asList(6, 5, 7));
//        triangle.add(Arrays.asList(4, 1, 8, 3));

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(-1));
        triangle.add(Arrays.asList(-2, -3));

//        List<List<Integer>> triangle = new ArrayList<>();
//        triangle.add(Arrays.asList(-10));

        System.out.println(minimumTotal_own(triangle));
    }
}
