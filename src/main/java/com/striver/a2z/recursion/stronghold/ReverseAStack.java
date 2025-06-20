package com.striver.a2z.recursion.stronghold;

import java.util.Stack;

public class ReverseAStack {
    public void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()) {
            return;
        }
        int popped = stack.pop();
        reverseStack(stack);
        stack.push(popped);
    }
}
