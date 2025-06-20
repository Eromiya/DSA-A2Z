package com.striver.a2z.string.medium;

public class StringToInteger_8 {

    /**
     * Efficient one
     * @param s
     * @return
     */
    public int myAtoi(String s) {

        s = s.trim();
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        int i=0, sign = 1;
        long res =0; // to handle overflow
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
        while(i<len){
            if(charArr[i]<'0' || charArr[i]>'9'){
                break;
            }
            res =res * 10 + (charArr[i]-'0');
            if(res*sign > Integer.MAX_VALUE) { return Integer.MAX_VALUE;}
            if(res*sign < Integer.MIN_VALUE) { return Integer.MIN_VALUE;}
            i++;
        }
        return (int)(sign * res);
    }

    /**
     * Recursion --> Most Efficient
     * @param s
     * @return
     */
    public int myAtoiRec(String s) {
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


    /**
     * My unfinished Solution
     * @param s
     * @return
     */
    public int myAtoi1(String s) {

            s = s.trim();
            char[] charArr = s.toCharArray();
            int len = charArr.length;
            StringBuilder ret = new StringBuilder();
            for (int i = 0; i < len; i++) {
                char ch = charArr[i];
                if ((ch == '+' || ch == '-') && !ret.toString().isEmpty()) {
                    String out = ret.toString();
                    try {
                        return out.isEmpty() ? 0 : Integer.parseInt(out);
                    }
                    catch (Exception e) {
                        return out.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                } else if (!(Character.isDigit(ch) || ch == '+' || ch == '-')) {
                    String out = ret.toString();
                    try {
                        return out.isEmpty() ? 0 : Integer.parseInt(out);
                    }
                    catch (Exception e) {
                        return out.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                }

                ret.append(ch);
            }
            String out = ret.toString();
            try{
                return Integer.parseInt(out);
            }
            catch (Exception e) {
                return out.startsWith("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

    }
}
