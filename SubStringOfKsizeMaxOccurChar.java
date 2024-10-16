/*
 * alice has collection of song reprsented  as a string where each character represents a song.a playlist is a
 * substring with exacly k no of songs.she wants to create a playlist that contains maximum no of her favourite 
 * songs started with 'a'.find the value representing maximum no of favourite songs  that she can get in a playlist.
 */
public class SubStringOfKsizeMaxOccurChar {

    public static void main(String[] args) {
        String s="acdbaaca";
        int k=3;
        int i=0,j=-1;
        int max;
        int cnt=0;
        while (j<k-1) {
            if(s.charAt(++j)=='a'){
                cnt++;
            }
        }
        // System.out.println(j);
        max=cnt;
        while (j<s.length()-1) {
            if(s.charAt(i++)=='a') cnt--;
            if(s.charAt(++j)=='a') cnt++;
            max=Math.max(max, cnt);
        }
        System.out.println(max);
    }
}