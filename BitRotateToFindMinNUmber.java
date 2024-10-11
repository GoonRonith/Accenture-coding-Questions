/*
 * Problem Statement:
Objective: Write a program that takes a non-negative integer x and performs the following steps:

Count the number of unset bits (0s) in the binary representation of x.
Compute the largest possible number that can be formed by setting all these unset bits to 1, while keeping the total number of bits unchanged.
Output the computed number.
Steps:

The program should first count how many bits in x are unset (0).
It should then calculate the number that has all the unset bits of x set to 1.
Finally, it should output this newly formed number.
Example:

For x = 4 (binary: 100):

There are 2 unset bits (positions where there are 0s).
The largest number that can be formed by setting all bits to 1 (with the same number of bits) is 3 (binary: 011).
Therefore, the output should be 3.
 */
public class BitRotateToFindMinNUmber {

    public static void main(String[] args) {
        int x=4;
        int setBits=0;
        while (x!=0) {
           int res=x&1;
           System.out.println(res+" res");
           if(res==0) setBits+=1;
           x=x>>1;
           System.out.println(x+ " x");
        }
        System.out.println((int)Math.pow(2, setBits)-1);
    }
}
