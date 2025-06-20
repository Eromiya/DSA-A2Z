package com.striver.a2z.recursion.stronghold;

public class CountGoodNumbers_1922 {
    /**
     * Brute Force
     * @param n
     * @return
     */
    public int countGoodNumbers1(long n) {
        int start = (int)Math.pow(10, n-1);
        int end = (int)(Math.pow(10, n))-1;
        int count =0;
        if(n==1){
            count=1;
        }
        for(int i=start;i<=end;i++){
            if(n%2!=0 && i%2!=0){
                continue;
            }
            char[] number = String.valueOf(i).toCharArray();
            int j=0;
            while(j<number.length){
                if(j%2==0 && number[j]%2!=0){
                    j++;
                    continue;
                }
                else if(j%2!=0 && !(number[j]==2||number[j]==3||number[j]==5||number[j]==7)){
                    j++;
                    continue;
                }
                count++;
                j++;
            }
        }
        return count;
    }
}
