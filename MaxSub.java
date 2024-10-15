
/*
 * Write a Java program that finds the maximum sum of a contiguous subarray from a given array of integers.

Input
You are given an array a[] of integers, which may include both positive and negative values.
The size of the array can vary, but for the purposes of this problem, consider the array size to be at least 1.
Output
The program should output the maximum sum of any contiguous subarray in the given array.
Constraints
The array contains at least one element.
The elements of the array are integers, and their values range from -10^4 to 10^4.
Example
Given the array a = [-3, 5, 4, -1, 7, 8]:

The contiguous subarray with the maximum sum is [5, 4, -1, 7, 8] with a sum of 23.
 */
public class MaxSub{
    public static void main(String[] args) {
        int ans=0;
        int a[]={-3,5,4,-1,7,8};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum<0){
            sum=0;
        }
        ans=Math.max(ans, sum);
    }
    System.err.println(ans);
    }
}