/*
 * 
Problem Statement: Find the Most Frequent Vowel
Write a program that takes a string as input and identifies the vowel that appears the most frequently. If multiple vowels have the same highest frequency, return any one of them. The program should also return the count of occurrences for that vowel. If there are no vowels in the string, the program should output an appropriate message.

Input
A single string s (1 ≤ |s| ≤ 10^5), which consists of lowercase English letters.
Output
Print the vowel that appears the most frequently along with its count.
If no vowels are present in the string, output a message indicating that no vowels were found.
 */
import java.util.*;
public class MaxVowel {
    public static void main(String[] args) {
        String s="abeaicaidao";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u')
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int maxOccr=0;
        char maxOccrChars=' ';
        for(char k:map.keySet()){
            if(map.get(k)>maxOccr){
                maxOccr=map.get(k);
                maxOccrChars=k;
            }
        }
        if(maxOccr>0){
            System.out.println(maxOccrChars+"->"+maxOccr);
        }
        else{
            System.out.println("no vowels found");
        }
        
    }
}
