public class SecondLargeElement {
    public static void main(String[] args) {
        int a[]={3,12,45,100,96,32,99};
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max){
                secondMax=max;
                max=a[i];
                
            }
            else if(a[i]>secondMax && max!=a[i]){
                secondMax=a[i];
            }
        }
        System.out.println(secondMax);
    }
}
