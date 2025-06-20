package com.striver.a2z.string.easy;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    // Most Efficient
    public static String longestCommonPrefix(String[] strs) {
        String ref = "";
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen){
                minLen = strs[i].length();
                ref = strs[i];
            }
        }

        while(minLen>=0){
            boolean commonFound = true;
            for(String str : strs){
                if(!str.equals(ref) && !str.startsWith(ref.substring(0, minLen))){
                    commonFound = false;
                    break;
                }
            }
            if(commonFound){
                return ref.substring(0, minLen);
            }
            minLen--;
        }
        return "";
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
