public class PeakElement {
    public static void main(String[] args) {
        int a[]={3,5,4};
        int ans=-1;
        for(int i=1;i<a.length;i++){
            if(a[i] < a[i-1]){
                ans=a[i-1];
                break;
            }
            else{
                ans=a[i];
            }
        }
        System.out.println(ans);
    }
}
