
public class Permutation {

    public static int getFactorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        String s="bcdae";
        char voewls[]={'A','E','I','O','U','a','e','i','o','u'};
        int cnt=0;
        boolean isPresent;
        for(int i=0;i<s.length();i++){
            isPresent=false;
            for(int j=0;j<voewls.length;j++){
                if(s.charAt(i)==voewls[j]){
                    isPresent=true;
                    break;
                }
            }
            if(!isPresent) {
                cnt+=1;
            }
        }
        System.out.println(cnt);
        System.out.println(getFactorial(cnt));
}
}