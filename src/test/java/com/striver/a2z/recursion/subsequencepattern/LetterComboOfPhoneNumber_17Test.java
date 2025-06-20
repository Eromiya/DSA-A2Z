package com.striver.a2z.recursion.subsequencepattern;

import org.junit.Test;

public class LetterComboOfPhoneNumber_17Test {
    LetterComboOfPhoneNumber_17 l = new LetterComboOfPhoneNumber_17();

    @Test
    public void test1(){
        System.out.println(l.letterCombinations("23"));
    }

    @Test
    public void test2(){
        System.out.println(l.letterCombinations("2"));
    }

    @Test
    public void test3(){
        System.out.println(l.letterCombinations("9"));
    }
}
