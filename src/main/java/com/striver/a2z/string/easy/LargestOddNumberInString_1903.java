package com.striver.a2z.string.easy;

public class LargestOddNumberInString_1903 {
    public String largestOdd(String num){
        int len = num.length();
        for(int i=len;i>0;i--){
            int lastChar = num.charAt(i-1);
            if(lastChar%2!=0){
                return num.substring(0, i);
            }
        }
        return "";
    }
}
