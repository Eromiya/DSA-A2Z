package com.striver.a2z.contest;

import java.util.Objects;
import java.util.Stack;

public class MinStack {
        int min = Integer.MAX_VALUE;
        Stack<Integer> minStack;
        Stack<Integer> actualStack;
        Stack<Integer> tempStack;
        public MinStack() {
            minStack = new Stack<>();
            tempStack = new Stack<>();
            actualStack = new Stack<>();
        }

        public void push(int val) {
            while(!minStack.isEmpty() && minStack.peek()<val){
                tempStack.push(minStack.pop());
            }
            minStack.push(val);
            while(!tempStack.isEmpty()){
                minStack.push(tempStack.pop());
            }
            actualStack.push(val);
        }

        public void pop() {
            while(!minStack.isEmpty() && !minStack.peek().equals(actualStack.peek())){
                tempStack.push(minStack.pop());
            }
            minStack.pop();
            while(!tempStack.isEmpty()){
                minStack.push(tempStack.pop());
            }
            actualStack.pop();
        }

        public int top() {
            return actualStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

    public static void main(String[] args) {
//         Example 1
        MinStack minStack1 = new MinStack();
        minStack1.push(-2);
        minStack1.push(0);
        minStack1.push(-3);
        System.out.println(minStack1.getMin());
        minStack1.pop();
        System.out.println(minStack1.top());
        System.out.println(minStack1.getMin());

        // Example 2
        MinStack minStack2 = new MinStack();
        minStack2.push(512);
        minStack2.push(-1024);
        minStack2.push(-1024);
        minStack2.push(512);
        minStack2.pop();
        System.out.println(minStack2.getMin());
        minStack2.pop();
        System.out.println(minStack2.getMin());
        minStack2.pop();
        System.out.println(minStack2.getMin());
    }
    }


