package com.striver.a2z.recursion.stronghold;

import java.util.Stack;

public class SortAStack {
    public void sortStack(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int popped = stack.pop();
            sortStack(stack);
            sortInserted(stack, popped);
        }
    }

    public void sortInserted(Stack<Integer> stack, int pop) {
        if (stack.isEmpty() || stack.peek() < pop) {
            stack.push(pop);
            return;
        }
        int pop2 = stack.pop();
        sortInserted(stack, pop);
        stack.push(pop2);
    }
}
