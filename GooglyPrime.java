/*
 * You are given an integer n. The task is to:

Calculate the sum of the digits of n.
Check if this sum is a prime number.
If the sum is prime, output "googly prime", otherwise output "not googly prime".
Input:
A positive integer n (1 ≤ n ≤ 10^6).
Output:
Print "googly prime" if the sum of the digits of n is a prime number.
Print "not googly prime" if the sum is not a prime number.
 */
public class GooglyPrime {
    public static void main(String[] args) {
        int n=33561;
        int sum=0;
        while (n!=0) {
            int remainder=n%10;
            sum+=remainder;
            n=n/10;
        }
        if (isPrime(sum)) {
            System.out.println("googly prime");
        }
        else{
            System.out.println("not googly prime");
        }
    }

    public static boolean isPrime(int n){
        if(n==1 || n==2 || n==0) return true;
        for (int i = 2; i <= n/2; i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
