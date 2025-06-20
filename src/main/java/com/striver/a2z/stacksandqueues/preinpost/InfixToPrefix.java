package com.striver.a2z.stacksandqueues.preinpost;


import java.util.Stack;

/**
 * 1. Reverse the infix expression. [Note while reversing each '(' will become ')' and each ')' becomes '('.]
 * 1.a) So replace '(' with ')' and vice versa.
 * 2. Convert the reversed infix expression to postfix expression
 * 3. Reverse the postfix expression and return it.
 */
public class InfixToPrefix {
    public String convertInfixToPrefix(String str){
        String strRev = new StringBuilder(str).reverse().toString();
        String postfix = infixToPostfix(convertPostfixToPrefix(strRev));
        return new StringBuilder(postfix).reverse().toString();
    }
    public String convertPostfixToPrefix(String s){
        int len = s.length();
        char[] charArr = s.toCharArray();
        for(int i=0;i<len;i++){
            if(charArr[i] == '('){
                charArr[i] =')';
            }
            else if(charArr[i] == ')'){
                charArr[i] ='(';
            }
        }
        return new String(charArr);
    }

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
