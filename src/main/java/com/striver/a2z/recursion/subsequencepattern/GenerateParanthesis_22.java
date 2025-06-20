package com.striver.a2z.recursion.subsequencepattern;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis_22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateList(result, 0, 0, "", n);
        return result;
    }

    public void generateList(List<String> result, int open, int close, String str, int n) {
        if (str.length() == n * 2) {
            result.add(str);
            return;
        }

        if (open < n) {
            generateList(result, open + 1, close, str + "(", n);
        }
        if (close < open) {
            generateList(result, open, close + 1, str + ")", n);
        }
    }
}
