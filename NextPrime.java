public class NextPrime {

    public static boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=7;
        int NextPrime=11;
        int cnt=n+1;
        if(isPrime(n)){
            while (cnt<=NextPrime) {
                if(isPrime(cnt)){
                    break;
                }
                cnt++;
            }
        }
        if(cnt==NextPrime){
            System.out.println("NextPrime is correct");
        }
        else{
            System.out.println("NextPrime is incorrect");
        }
    }
}