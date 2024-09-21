public class FirstCharAppearsTwice {
    public static void main(String[] args) {
        String s="abbcba";
        System.out.println(solution1(s));
    }
    public static char solution1(String s){
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            int asciiVal=s.charAt(i)-'a';
            freq[asciiVal]+=1;
            if(freq[asciiVal]>=2) return s.charAt(i);
            // System.out.println(asciiVal);
        }
        return '0';
    }
}
