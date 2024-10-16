public class reverseArrayANDSum {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int sum=0;
        if(a.length%2==0){
            for (int i = 0; i < a.length; i++) {
                if(i%2!=0) sum+=a[i];
            }
        }
        else{
            for (int i = 0; i < a.length; i++) {
                if(i%2==0) sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
