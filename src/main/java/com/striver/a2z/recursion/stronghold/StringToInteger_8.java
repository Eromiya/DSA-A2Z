package com.striver.a2z.recursion.stronghold;

public class StringToInteger_8 {
    /**
     * Recursion --> Most Efficient
     * @param s
     * @return
     */
    public int myAtoi(String s) {
        s = s.trim();
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        int i=0, sign = 1;
        long res =0;
        if(len ==0){
            return 0;
        }
        if(charArr[i]=='-'){
            sign = -1;
            i++;
        }
        else if(charArr[i]=='+'){
            i++;
        }
        return rec(sign, i, charArr, res);
    }

    public int rec(int sign, int i, char[] charArr, long res){
        if(i>=charArr.length){
            return (int)(sign * res);
        }
        if(charArr[i]<'0' || charArr[i]>'9'){
            return (int)(sign * res);
        }
        res =res * 10 + (charArr[i]-'0');
        if(res*sign > Integer.MAX_VALUE) { return Integer.MAX_VALUE;}
        if(res*sign < Integer.MIN_VALUE) { return Integer.MIN_VALUE;}
        return rec(sign, i+1, charArr, res);
    }

}
