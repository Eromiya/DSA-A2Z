package com.striver.a2z.basic.math;

public class IsArmstrongNumber {
    public boolean isArmstrongNumber(int num){
        int n = num;
        int len = String.valueOf(n).length();
        int sum = 0;
        while(n!=0)
        {
            int dig = n%10;
            sum += Math.pow(dig, len);
            n= n/10;
        }
        return sum == num;
    }
}
