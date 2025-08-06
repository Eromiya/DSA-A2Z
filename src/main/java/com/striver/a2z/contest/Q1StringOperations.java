package com.striver.a2z.contest;

public class Q1StringOperations {
    public static String processStr(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch:arr){
            if(ch == '*'){
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else if(ch == '#'){
                sb.append(sb);
            }
            else if(ch == '%'){
                sb.reverse();
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "a#b%*";
        System.out.println(processStr(input));
    }
}
