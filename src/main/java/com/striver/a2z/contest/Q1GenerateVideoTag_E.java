package com.striver.a2z.contest;

public class Q1GenerateVideoTag_E {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder("#");
        for(int i=0;i<caption.length()&&sb.length()<100;i++){
            if(i==0){
                sb.append(Character.toLowerCase(caption.charAt(i)));
            }
            else if(caption.charAt(i)== ' ' && i<caption.length()-1){
                if(caption.charAt(i+1)!= ' '){
                    sb.append(Character.toUpperCase(caption.charAt(i+1)));
                    i++;
                }
            }
            else{
                sb.append(Character.toLowerCase(caption.charAt(i)));
            }
        }
        return sb.toString();
    }
//    public String generateTag(String caption) {
//        StringBuilder sb = new StringBuilder("#");
//
//    }
}
