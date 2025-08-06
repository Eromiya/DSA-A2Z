package teamwork.strivers.a2z.recursion;

public class SumOfFirstNNumbers {
    public static int sumOfNNumbers( int n){
        if(n<=0){
            return 0;
        }
        return n+sumOfNNumbers(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(100));
    }
}
