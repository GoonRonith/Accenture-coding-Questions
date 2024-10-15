
/*
 *  Longest Subarray with Sum Equal to K
Write a Java program that finds the length of the longest contiguous subarray whose sum is equal to a given value K.

Input
An array a[] of integers (can include positive, negative, and zero values).
An integer K which is the target sum.
Output
The program should return the length of the longest contiguous subarray that has a sum equal to K.
If no such subarray exists, return 0.
 */
import java.util.*;;
public class MaxSubArrayWithKSum {
    public static void main(String[] args) {
        int a[]={10,5,2,7,1,9};
		int k=15;
		System.out.println(solution1(a,a.length,k));
    }

    public static int solution1(int a[],int n,int k){
        //if the array contains both positive,negative and zeroes then this method should be applied...
        int len=0;
        int preSum=0;
        int sub;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            preSum+=a[i];
            if(preSum==k){
                len=Math.max(len, i-0+1);
            }
            else{
                 sub=preSum-k;
                if(map.containsKey(sub)){
                    int idx=map.get(sub);
                    idx+=1;
                    len=Math.max(len, i-idx+1);
                }
               
            }
            if(!map.containsKey(preSum)){
                map.put(preSum, i);
            }
        }
        return len;
    }
}
