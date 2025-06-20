package com.striver.a2z.string.medium;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    // My Solution
    public int romanToInt(String s) {
        int sum =0, n=s.length();
        for(int i=0;i<n;i++){
            if(i<n-1 ){
                if(s.charAt(i)=='I' &&  s.charAt(i+1)=='V'){
                    sum+= 4;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='I' &&  s.charAt(i+1)=='X'){
                    sum+= 9;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='X' &&  s.charAt(i+1)=='L'){
                    sum+= 40;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='X' &&  s.charAt(i+1)=='C'){
                    sum+= 90;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='C' &&  s.charAt(i+1)=='D'){
                    sum+= 400;
                    i++;
                    continue;
                }
                else if(s.charAt(i)=='C' &&  s.charAt(i+1)=='M'){
                    sum+= 900;
                    i++;
                    continue;
                }
            }
            sum += symbols(s.charAt(i));

        }
        return sum;
    }

    public int symbols(char ch){
        switch(ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt1(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                ans -= m.get(s.charAt(i));
            } else {
                ans += m.get(s.charAt(i));
            }
        }

        return ans;
    }
}
