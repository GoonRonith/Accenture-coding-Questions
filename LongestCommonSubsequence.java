public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="tdventure";
        String s2="torture";
        // System.out.println(lcsRecursive(s1.length()-1,s2.length()-1,s1,s2));
        System.out.println(lcs(s1.length(),s2.length(),s1,s2));
    }

    public static int lcsRecursive(int idx1,int idx2,String s1,String s2){
        if(idx1<0 || idx2<0) return 0;
        if(s1.charAt(idx1)==s2.charAt(idx2)) return 1+lcsRecursive(idx1-1,idx2-1,s1,s2);
        else{
            return Math.max(lcsRecursive(idx1-1,idx2,s1,s2), lcsRecursive(idx1,idx2-1,s1,s2));
        }
        
    }
    public static int lcs(int idx1,int idx2,String s1,String s2){
        int[][] dp = new int[idx1 + 1][idx2 + 1];
        int maxLength=0;
        for (int i = 1; i <= idx1; i++) {
            for(int j=1 ; j<= idx2 ;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(maxLength < dp[i][j]) {
                        maxLength=dp[i][j];
                    }
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return maxLength;
    }
}
