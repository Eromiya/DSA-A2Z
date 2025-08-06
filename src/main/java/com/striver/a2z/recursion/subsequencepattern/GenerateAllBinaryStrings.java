package com.striver.a2z.recursion.subsequencepattern;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStrings {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
//        StringBuilder sb1 = new StringBuilder("0");
//        StringBuilder sb2 = new StringBuilder("1");

//        generateBinaryStrings(new StringBuilder(), n, result);
//        generateBinaryStrings(sb2, n, result);
        generateBinaryStrings1("", n, result);
        return result;
    }
    public void generateBinaryStrings(StringBuilder sb, int n, List<String> result){
        if(sb.length() == n){
            result.add(sb.toString());
            return;
        }
        sb.append("0");
        generateBinaryStrings(sb, n, result);
        sb.deleteCharAt(sb.length()-1);
        sb.append("1");
        generateBinaryStrings(sb, n, result);
        sb.deleteCharAt(sb.length()-1);
    }

    public void generateBinaryStrings1(String sb, int n, List<String> result){
        if(sb.length() == n){
            result.add(sb);
            return;
        }
        generateBinaryStrings1(sb+"0", n, result);
        generateBinaryStrings1(sb+"1", n, result);
    }
}
