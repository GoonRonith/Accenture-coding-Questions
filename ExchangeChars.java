public class ExchangeChars {
    public static void main(String[] args) {
        String s="apple";
        char c1='a';
        char c2='p';
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c1){
                ans+=c2;
            }
            else if(s.charAt(i)==c2){
                ans+=c1;
            }
            else ans+=s.charAt(i);
        }

        System.out.println(ans);
    }
}
