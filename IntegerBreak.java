/*
 * Given an integer n, break the integer into the sum of at least two positive integers and maximize the product of those integers. Return the maximum product you can obtain.

Input:
A single integer n (2 ≤ n ≤ 58).
Output:
The maximum product you can obtain by breaking the integer n into at least two positive integers.
 */

public class IntegerBreak {
    public static void main(String[] args) {
        int n=10;
        int q=n/3;
        if(n%3==0){
            System.out.println(Math.pow(3, q));
        }
        else if(n%3==1){
            System.out.println(Math.pow(3, q-1)*4);
        }
        else{
            System.out.println(Math.pow(3, q)*2);
        }
    }
}
