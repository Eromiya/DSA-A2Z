package com.striver.a2z.basic.math;

/**
 * Determine whether the given is a prime number or not.
 *
 * A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
 * Input : 7
 * Output : true
 *
 * Status : Done
 */
public class IsPrime {
    public boolean isPrime(int num){
        if(num == 2 || num%2 == 0 || num%3==0){
            return false;
        }
        for(int i=5;i*i<=num;i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
