package com.striver.a2z.dynamicprogramming.oneddp;

import java.util.Arrays;

public class DP7_NinjaTraining {
    //Recursion
    public static int maxMeritNinjaTraining(int[][] matrix, int day, int last){
        int maxMerit = 0;
        if(day == 0){
            for(int i=0;i<=2;i++){
                if(i!=last){
                    maxMerit = Math.max(maxMerit, matrix[day][i]);
                }
            }
            return maxMerit;
        }
        else{
            for(int i=0;i<=2;i++){
                if(i!=last){
                    int currMerit = matrix[day][i] + maxMeritNinjaTraining(matrix, day-1, i);
                    maxMerit = Math.max(maxMerit, currMerit);
                }
            }
        }
        return maxMerit;
    }

    //Memoization
    public static int maxMeritNinjaTraining_Mem(int[][] matrix, int day, int last, int[][] dp){
        if (dp[day][last] != -1) return dp[day][last];
        int maxMerit = 0;
        if(day == 0){
            for(int i=0;i<=2;i++){
                if(i!=last){
                    maxMerit = Math.max(maxMerit, matrix[day][i]);
                }
            }
            return dp[day][last] = maxMerit;
        }
        else{
            for(int i=0;i<=2;i++){
                if(i!=last){
                    int currMerit = matrix[day][i] + maxMeritNinjaTraining_Mem(matrix, day-1, i, dp);
                    maxMerit = Math.max(maxMerit, currMerit);
                }

            }
        }
        return dp[day][last] = maxMerit;
    }

    //Memoization
    public static int maxMeritNinjaTraining_Tab(int[][] matrix, int day, int[][] dp){
        dp[0][0] = Math.max(matrix[0][1], matrix[0][2]);
        dp[0][1] = Math.max(matrix[0][0], matrix[0][2]);
        dp[0][2] = Math.max(matrix[0][0], matrix[0][1]);
        dp[0][3] = Math.max(matrix[0][0], Math.max(matrix[0][1], matrix[0][2]));
        int maxMerit =0;
        for(int itr = 1; itr<day;itr++){
            for(int last =0;last <= 3;last++){
                for(int task=0;task<=2;task++){
                    if(task!=last){
                        int currMerit = matrix[day][task] + dp[day-1][task];
                        maxMerit = Math.max(maxMerit, currMerit);
                    }
                }
                dp[day][last] = maxMerit;
            }
        }
        return dp[day-1][3] = maxMerit;
    }

    public static int ninjaTraining(int[][] matrix) {
        int[][] dp = new int[matrix.length][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return maxMeritNinjaTraining_Mem(matrix, matrix.length-1, 3, dp);
    }


    public static void main(String[] args) {
        int[][] matrix = {{10, 40, 70}, {20, 50, 80}, {30, 60, 90}};
        System.out.println(ninjaTraining(matrix));
        int[][] matrix1 = {{70, 40, 10}, {180, 20, 5}, {200, 60, 30}};
        System.out.println(ninjaTraining(matrix1));
    }
}
