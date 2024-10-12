/*
 * ou are given a string s and two characters c1 and c2. The task is to create a program that swaps every occurrence of c1 with c2 and every occurrence of c2 with c1 in the given string. All other characters should remain unchanged.

Input:
A string s of lowercase letters (1 ≤ length of s ≤ 100).
Two characters c1 and c2, both of which are lowercase letters and may or may not appear in s.
Output:
A new string where every occurrence of c1 in s is replaced with c2 and every occurrence of c2 is replaced with c1.
 */
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
