public class BitRotateToFindMinNUmber {
    public static void main(String[] args) {
        int x=2;
        int setBits=0;
        while (x!=0) {
           int res=x&1;
           if(res==0) setBits+=1;
           x=x>>1;
        }
        System.out.println((int)Math.pow(2, setBits)-1);
    }
}
