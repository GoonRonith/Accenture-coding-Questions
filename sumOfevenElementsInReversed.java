/*
 Q:-> reverse the given array and find the sum of elements at even indexed of the reversed array
 */

public class sumOfevenElementsInReversed{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum=0;
        int n=a.length;
        for(int i=0;i<a.length;i++){
            if((n-i-1)%2==0) sum+=a[i];
        }
        System.out.println(sum);
    }
}