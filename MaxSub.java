
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