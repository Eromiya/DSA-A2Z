package com.striver.a2z.string.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        int m = s.length(), n = t.length();
        if(m!=n){
            return false;
        }
        for(int i=0;i<m;i++){
            if(smap.containsKey(s.charAt(i))){
                if(smap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else if(tmap.containsKey(t.charAt(i))){
                if(tmap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            smap.put(s.charAt(i), t.charAt(i));
            tmap.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }
}
