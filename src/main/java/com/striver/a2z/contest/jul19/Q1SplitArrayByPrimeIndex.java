package com.striver.a2z.contest.jul19;

public class Q1SplitArrayByPrimeIndex {
    public static void main(String[] args) {
        int[] nums = {-54818575,801071518,745054848,-415289833,161564441,706292027,306478283,943480367,222076810,992619933};
        // in : -54818575,801071518,745054848,-415289833,161564441,706292027,306478283,943480367,222076810,992619933
        // exp 449455001
        System.out.println(splitArray(nums));
    }
    public static long splitArray(int[] nums) {
            long sumA = 0;
            long sumB = 0;
            for (int i = 0; i < nums.length; i++) {
                if (isPrime(i)) {
                    sumA += nums[i];
                } else {
                    sumB += nums[i];
                }
            }
            return Math.abs(sumA - sumB);
        }

        public static boolean isPrime(int num){
            if(num<=1){
                return false;
            }
            if (num == 2 || num == 3 || num == 5) {
                return true;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }