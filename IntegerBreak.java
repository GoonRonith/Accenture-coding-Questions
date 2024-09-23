public class IntegerBreak {
    public static void main(String[] args) {
        int n=10;
        int q=n/3;
        if(n%3==0){
            System.out.println(Math.pow(3, q));
        }
        else if(n%3==1){
            System.out.println(Math.pow(3, q-1)*4);
        }
        else{
            System.out.println(Math.pow(3, q)*2);
        }
    }
}
