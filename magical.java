public class magical {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int num=i;
            int zerCount=0;
            while (num!=0) {
                int rem=num%2;
                if(rem==0) zerCount++;
                num=num/2;
            }
            if(zerCount%2!=0) System.out.println("Magical Number->"+i);
        }
    }
}
