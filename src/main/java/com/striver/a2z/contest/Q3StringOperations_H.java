package com.striver.a2z.contest;

import java.util.ArrayList;
import java.util.List;

public class Q3StringOperations_H {
    public static char processStr(String s, long k) {
        char[] arr = s.toCharArray();
        List<Character> sb = new ArrayList<>();
        boolean reversed = false;
        for(char ch:arr){
            if(ch == '*'){
                if (!sb.isEmpty()) {
                    if (reversed) {
                        sb.remove(0);
                    } else {
                        sb.remove(sb.size() - 1);
                    }
                }
            }
            else if(ch == '#') {
                long currLen = sb.size();

                if (currLen * 2 > k + 1) {
                    List<Character> temp = new ArrayList<>();

                    long needed = (k + 1) - currLen;
                    for (int i = 0; i < needed && i < currLen; i++) {
                        temp.add(sb.get(i));
                    }

                    sb.addAll(temp);
                } else {
                    sb.addAll(new ArrayList<>(sb));
                }
            }
            else if(ch == '%'){
                reversed = !reversed;
            }
            else{
                if (reversed) {
                    sb.add(0, ch);
                } else {
                    sb.add(ch);
                }
            }
        }
        return k >= sb.size() ? '.' : sb.get((int) k);
    }

    public static void main(String[] args) {
        String input = "wuxi##%u#%";
        System.out.println(processStr(input, 18));
    }
}
