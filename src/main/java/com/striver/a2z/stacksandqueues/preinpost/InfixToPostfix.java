package com.striver.a2z.stacksandqueues.preinpost;

import java.util.Stack;

public class InfixToPostfix {

    public String infixToPostfix(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        StringBuilder out = new StringBuilder();
        for(int i=0;i<charArr.length;i++){
            char ch = charArr[i];
            if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(stack.peek()!='('){
                    out.append(stack.pop());
                }
                stack.pop();
            }
            else if(operandValue(ch) == 0){
                out.append(ch);
            }
            else if(stack.isEmpty() || operandValue(stack.peek()) < operandValue(ch)){
                stack.push(ch);
            }
            else {
                while (!stack.isEmpty() && (operandValue(stack.peek()) >= operandValue(ch))) {
                    out.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            out.append(stack.pop());
        }
        return out.toString();
    }

    public int operandValue(char ch){
        switch(ch){
            case '-':
                return 1;
            case '+':
                return 1;
            case '/':
                return 2;
            case '*':
                return 2;
            case '^':
                return 3;
            default:
                return 0;
        }
    }
}
