package com.striver.a2z.recursion.subsequencepattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterComboOfPhoneNumber_17 {


    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        StringBuilder sb = new StringBuilder();
        List<String> out = new ArrayList<>();
        generatePhoneNumberCombo(sb, digits, out, 0, map);
        return out;
    }

    public void generatePhoneNumberCombo(StringBuilder str, String digits, List<String> out, int k, Map<Integer, String> map){
        if(digits.length()==str.length()){
            out.add(str.toString());
            return;
        }
        String curr = map.get(digits.charAt(k)-'0');
        for(int i=0;i<curr.length();i++){
                str.append(curr.charAt(i));
                generatePhoneNumberCombo(str, digits, out, k+1, map);
                str.deleteCharAt(str.length()-1);
        }
    }
}
