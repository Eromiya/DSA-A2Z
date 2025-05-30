package com.striver.a2z.basic.recursion;

import java.util.Arrays;

public class IsStringPalindrome {
    public static boolean isStringPalindrome(int i, String str){
        if(i> str.length()/2){
            return true;
        }

        if(str.charAt(i)!= str.charAt(str.length()-i-1)){
            return false;
        }
        return isStringPalindrome(i+1, str);
    }

    public static void main(String[] args) {
        System.out.println(isStringPalindrome(0, "madam"));
        System.out.println(isStringPalindrome(0, "madamoo"));
    }

}
