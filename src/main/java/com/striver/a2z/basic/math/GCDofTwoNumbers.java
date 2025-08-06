package com.striver.a2z.basic.math;

public class GCDofTwoNumbers {
    public int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    /**
     * Optimsed one
     * @param a
     * @param b
     * @return
     */
    public int gcd2(int a, int b) {
        if (b == 0) return a;
        return gcd2(b, a % b);
    }
}
