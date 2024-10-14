/**
 * AddBitsInBinaryFrom
 */
public class AddBitsInBinaryFrom {
    public static void main(String[] args) {
        int n=15;
        int sum=0;
        while (n!=0) {
            int rem=n%2;
            if(rem==0) sum+=0;
            else sum+=1;
            n=n/2;
        }
        System.out.println(sum);
    }
    
}