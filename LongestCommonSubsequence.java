public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="adventure";
        String s2="torture";
        System.out.println(lcs(s1.length()-1,s2.length()-1,s1,s2));
    }

    public static int lcs(int idx1,int idx2,String s1,String s2){
        if(idx1<0 || idx2<0) return 0;
        if(s1.charAt(idx1)==s2.charAt(idx2)) return 1+lcs(idx1-1,idx2-1,s1,s2);
        else{
            return Math.max(lcs(idx1-1,idx2,s1,s2), lcs(idx1,idx2-1,s1,s2));
        }
        
    }
}
