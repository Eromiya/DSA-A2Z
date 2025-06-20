package com.striver.a2z.string.easy;

import java.util.Stack;

public class RemoveOuterParanthesis_1021 {
    public String removeOuterParanthesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] sArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sArr.length; i++) {
            char ch = sArr[i];
            if (stack.isEmpty() && ch == '(') {
                stack.push(ch);
            } else if (!stack.isEmpty() && ch == '(') {
                stack.push(ch);
                sb.append(ch);
            } else if (stack.size() > 1 && ch == ')') {
                stack.pop();
                sb.append(ch);
            } else if (stack.size() == 1 && ch == ')') {
                stack.pop();
            }
        }
        return sb.toString();

    }
}
