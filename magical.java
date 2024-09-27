
/*
 * find the magical numbers in range..
 * A number is magical if 
 * 1)convert it into binary
 * 2)replace 0 with 1 and 1 with 2 in binary string
 * 3)calculate sum of all digits in binary string
 * 4)if sum is odd then its a magical number
 * 
 * here intution is to count no of zeroes in binary representation as zeroes will be convertd into one and if no
 * of one is odd then whole sum value should be odd and if even then whole sum should be even.
 * 
 */
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
