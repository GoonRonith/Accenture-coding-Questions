public class reverseArrayANDSum {
    public static void main(String[] args) {
        int a[]={21,24,67,13,24,27,};
        int lastIndex=a.length-1;
        int i=0;
        while (i<lastIndex)
        {
            int temp=a[i];
            a[i]=a[lastIndex];
            a[lastIndex]=temp;
            lastIndex--;
            i++;
        }
        int sum=0;
        for(int j=0;j<a.length;j++){
            if(j%2==0) sum+=a[j];
        }
        System.err.println(sum);
    }
}
