package com.striver.a2z.stacksandqueues.preinpost;

import java.util.Stack;

public class PostfixToInfix {
    public String postToInfix(String exp) {
        // code here
        Stack<String> stack = new Stack<>();
        int len = exp.length();
        for(int i=0 ;i<len;i++){
            char ch = exp.charAt(i);
            if(!Character.isLetter(ch)){
                if(!stack.isEmpty()){
                    String opr1 = stack.pop();
                    String opr2 = stack.pop();
                    stack.push('(' + opr2 + ch + opr1 + ')');
                }
            }
            else {
                stack.push(ch +"");
            }
        }
        return stack.peek();
    }
}
