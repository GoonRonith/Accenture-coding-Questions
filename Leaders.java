/*
 * 
Problem Statement: Find the Sum of Leaders in the List
You are given a list of integers. An element is called a "leader" if it is greater than all the elements to its right in the list. The task is to find all the leaders in the list, and then compute the sum of these leaders.

Input:
A list l of integers (1 ≤ length of l ≤ 100, 1 ≤ l[i] ≤ 1000).
Output:
The sum of all the leader elements in the list.
 */
import java.util.*;
 public class Leaders {
    public static void main(String[] args) {
        int a[]={52,66,64,36,45,24,32};
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(a[a.length-1]);
        int max=a[a.length-1];
        for (int i = a.length-1; i >=0; i--) {
            if(a[i] > max){
                ans.add(a[i]);
                max=a[i];
            }
        }
        System.out.println(ans);
    }
}
