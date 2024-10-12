/*
 * You are given a string s consisting of lowercase English letters. The task is to find the first character in the string that appears at least twice. If no character appears more than once, return a special value.

Input:
A string s consisting of lowercase English letters (1 ≤ length of s ≤ 100).
Output:
The first character that appears at least twice in the string.
If no such character exists, return '0'.
 */
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
