package com.striver.a2z.string.medium;

public class MaxNestingDepthParanthesis_1614 {
    public int maxDepth(String s) {
        char[] charArr = s.toCharArray();
        int len = s.length();
        int maxSize = 0;
        int count =0;
        for(int i=0;i<len;i++){
            char ch = charArr[i];
            if( ch == '('){
                count++;
                if(maxSize < count){
                    maxSize = count;
                }
            }
            else if( ch == ')'){
                count--;
            }
        }
        return maxSize;
    }
}
