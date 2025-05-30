package com.striver.a2z.basic.math;

/**
 * Check whether the number is a palindrome number or not
 *
 * A palindrome number is a number which reads the same both left to right and right to left.
 * Input : 123
 * Output : 321
 *
 * Status : Done
 */
public class IsPalindrome {
    public boolean isPalindrome(int x){
        String str = String.valueOf(x);
        int len = str.length();
        for(int i =0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }

        }
        return true;
    }
}
