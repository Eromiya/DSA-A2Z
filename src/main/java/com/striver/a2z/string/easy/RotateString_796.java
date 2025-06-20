package com.striver.a2z.string.easy;

public class RotateString_796 {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
