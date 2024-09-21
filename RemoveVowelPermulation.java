public class RemoveVowelPermulation {
    public static void main(String[] args) {
        String s[]={"hello","aaeeiou"};
        int ans=0;
        for(int i=0;i<s.length;i++){
            int cnt=0;
            for(int j=0;j<s[i].length();j++){
                if(!isVowel(s[i].charAt(j))) cnt++;
            }
            ans=Math.max(ans,cnt);
        }
        System.out.println(fact(ans));
    }

    public static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        return n*fact(n-1);
    }
}
