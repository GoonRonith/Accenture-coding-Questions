public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "tdventure";
        String s2 = "torture";
        // System.out.println("length=>"+lcs(s1.length(), s2.length(), s1, s2));
        System.out.println("length=>"+lcsRecursive(s1.length()-1, s2.length()-1, s1, s2));
    }

    public static int lcs(int len1, int len2, String s1, String s2) {
        int[][] dp = new int[len1 + 1][len2 + 1];
        int maxLength = 0;
        int pos1=0,pos2=0;
        StringBuilder ans=new StringBuilder();
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    // maxLength = Math.max(maxLength, dp[i][j]);
                    if(maxLength < dp[i][j]) {
                        maxLength=dp[i][j];
                        pos1=i;
                        pos2=j;
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
       while (dp[pos1][pos2]!=0) {
        ans.append(s1.charAt(pos1-1));
           pos1--;
           pos2--;
       }

        System.out.println("Longest Common substring=>"+ans.reverse());


        return maxLength;
    }

    public static int lcsRecursive(int len1, int len2, String s1, String s2){
        if(len1 <0 || len2<0) return 0;
        if(s1.charAt(len1)==s2.charAt(len2)) return 1+lcsRecursive(len1-1, len2-1, s1, s2);
        else return 0;
    }


}
