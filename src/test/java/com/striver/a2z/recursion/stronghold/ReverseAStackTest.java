package com.striver.a2z.recursion.stronghold;

import com.striver.a2z.recursion.stronghold.ReverseAStack;
import com.striver.a2z.recursion.stronghold.SortAStack;
import org.junit.Test;

import java.util.Stack;

public class ReverseAStackTest {
    ReverseAStack reverseAStack = new ReverseAStack();

    @Test
    public void test1(){
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        reverseAStack.reverseStack(s);
        System.out.println(s);
    }
}
