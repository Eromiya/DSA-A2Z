package com.striver.a2z.basic.math;

/**
 * Count the number of digits in the given number
 *
 * Input: n = 5534
 * Output: 4
 *
 * Status : Done
 */
public class CountDigits {
    public int countDigits(int num){
        int count =0;
        int n= num;
        if(String.valueOf(n).length()==1){
            return 1;
        }
        while(n!=0){
            int r = n%10;
            count++;
            n= n/10;
        }
        return count;
    }
}
