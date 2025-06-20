package com.striver.a2z.stacksandqueues.preinpost;

import java.util.Stack;

public class PostfixToPrefix {
    public String postToPre(String post_exp) {
        // code here
        Stack<String> stack = new Stack<>();
        int len = post_exp.length();
        for(int i=0 ;i<len;i++){
            char ch = post_exp.charAt(i);
            if(!Character.isLetter(ch)){
                if(!stack.isEmpty()){
                    String opr1 = stack.pop();
                    String opr2 = stack.pop();
                    stack.push(ch + opr2 + opr1 );
                }
            }
            else {
                stack.push(ch +"");
            }
        }

        return stack.peek();
    }
}
