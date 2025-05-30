package com.striver.a2z.basic.math;

/**
 * Reverse the digits of the given number
 *
 * Input: 123
 * Outout: 321
 *
 * Status : Done
 */
public class ReverseNumber {
    public int reverseNumber(int num){
        int n=num;
        int rev = 0;
        int power =1;
        while(n!=0){
            int rem = n%10;  //3
            rev = (rev*power) + rem;  //
            n= n/10;
            power = 10;
        }
        return rev;
    }
}
