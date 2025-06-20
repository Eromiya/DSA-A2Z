package com.striver.a2z.stacksandqueues.preinpost;

import java.util.Stack;

public class PrefixToPostfix {
    public String preToPost(String pre_exp) {
        // code here
        Stack<String> stack = new Stack<>();
        int len = pre_exp.length();
        for(int i=len-1;i>=0;i--){
            char ch = pre_exp.charAt(i);
            if(!Character.isLetter(ch)){
                if(!stack.isEmpty()){
                    String opr1 = stack.pop();
                    String opr2 = stack.pop();
                    stack.push(opr1 + opr2 + ch );
                }
            }
            else {
                stack.push(ch +"");
            }
        }
        return stack.peek();
    }

}
