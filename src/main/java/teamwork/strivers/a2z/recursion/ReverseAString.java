package teamwork.strivers.a2z.recursion;

import java.util.Arrays;

public class ReverseAString {
    public static String reverseString(String arr){
        return String.valueOf(check(arr.toCharArray(), 0, arr.length()-1));
    }

    private static char[] check(char[] arr, int start, int end) {
        if(start>=end){
            return arr;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return check(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("12345666"));
    }
}
