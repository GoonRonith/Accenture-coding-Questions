public class BinaryStringOperation {
    public static void main(String[] args) {
        String s="1c0c1c1a0b1";
        int idx=1;
        int ans=s.charAt(0)-'0';
        while (idx<s.length()) {
            if(s.charAt(idx)=='c'){
                ans=ans^(s.charAt(idx+1)-'0');
            }
            else if(s.charAt(idx)=='b'){
                ans=ans|(s.charAt(idx+1)-'0');
            }
            else{
                ans=ans&(s.charAt(idx+1)-'0');
            }

            idx+=2;
        }
        System.out.println(ans);
    }
}
