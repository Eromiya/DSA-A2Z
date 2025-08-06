package teamwork.strivers.a2z.recursion;

public class PrimeNumber {
    public static boolean isPrime(int n, int i){
        if(n == 2 || n==3 || n==5){
            return true;
        }
        if(n%i==0){
            return false;
        }
        if(i>=Math.sqrt(n)){
            return true;
        }
        return isPrime(n , i+1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(53, 2));
    }
}
