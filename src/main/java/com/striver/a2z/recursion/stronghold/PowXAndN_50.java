package com.striver.a2z.recursion.stronghold;

public class PowXAndN_50 {
    public double myPow1(double x, int n) {
        /**
         * Add Below lines only if needed or leave it. Result will have a memory optimised solution
         */
            if (n == Integer.MAX_VALUE) return (x == 1) ? 1 : (x == -1) ? -1 : 0;
            if (n == Integer.MIN_VALUE) return (x == 1 || x == -1) ? 1 : 0;

            if(n<0){
                double neg = pos1(x, n*-1);
                return 1.0/neg;
            }
            return pos1(x, n);
        }
        public double pos1(double x, int n){
            if(n==0){
                return 1;
            }
            return x * pos(x, n-1);
        }

    /**
     * Efficient Solution
     */
    public double myPow(double x, int n) {
        // if (n == Integer.MAX_VALUE) return (x == 1) ? 1 : (x == -1) ? -1 : 0;
        // if (n == Integer.MIN_VALUE) return (x == 1 || x == -1) ? 1 : 0;
        if (n < 0) {
            double neg = pos(x, n);
            return 1.0 / -neg;
        }
        return pos(x, n);
    }

    public double pos(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = pos(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }
        return x * half * half;
    }
}
