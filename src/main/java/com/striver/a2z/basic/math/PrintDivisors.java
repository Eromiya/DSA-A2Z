package com.striver.a2z.basic.math;

/**
 *
 */
public class PrintDivisors {
    public static void printDivisors(int num){
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i==num/i) {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + num / i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        printDivisors(24);
        System.out.println();
        printDivisors(4);
    }
}
