package com.striver.a2z.string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidAnagram_242 {
    /**
     * Less Efficient - Brute Force
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram1(String s, String t) {
        int m = s.length();
        int n = t.length();
        Map<Character, Integer> maps = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();
        if(m!=n){
            return false;
        }
        for(int i=0;i<m;i++){
            maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0)+1);
            mapt.put(t.charAt(i), mapt.getOrDefault(t.charAt(i), 0)+1);
        }
        for(Character e: maps.keySet()){
            if(maps.get(e).equals(mapt.get(e))){
                return false;
            }
        }
        return true;
    }

    /**
     * Most Efficient
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
