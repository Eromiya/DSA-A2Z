package teamwork.strivers.a2z.recursion;

public class StringPalindrome {
    public static boolean isPalindrome(String str){
        return check(str, 0, str.length()-1);
    }

    private static boolean check(String str, int start, int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return check(str, start+1, end-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("AAB"));
    }
}
