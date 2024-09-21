public class Tribonacci{
    public static void main(String[] args) {
        int n=5;
        int t1=0,t2=1,t3=1;
        if(n!=1){
            for(int i=3;i<n;i++){
                t3=t1+t2+t3;
                t2=t3;
                t1=t2;
            }
            System.out.println(t3);
        }
        else{
            System.out.println(t1);
        }


        
    }
}