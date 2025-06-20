package com.striver.a2z.string.medium;

import java.util.*;

public class SortCharsByFrequency_451 {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, List<Character>> treeMap = new TreeMap<>();
        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            List<Character> list = new ArrayList<>();
            if (treeMap.containsKey(c.getValue())) {
                list = treeMap.get(c.getValue());
            }
            list.add(c.getKey());
            treeMap.put(c.getValue(), list);
        }
        StringBuilder sb = new StringBuilder();
        for(Integer i : treeMap.keySet()){
            for(Character ch : treeMap.get(i)){
                for(int k=0;k<i;k++){
                    sb.append(ch);
                }
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
