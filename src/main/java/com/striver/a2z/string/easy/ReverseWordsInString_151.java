package com.striver.a2z.string.easy;

public class ReverseWordsInString_151 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n= words.length;
        for(int i=n-1;i>=0;i--){
            if(words[i].isEmpty()){
                continue;
            }
            if(i!=n-1)
            {
                sb.append(" ");
            }
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
