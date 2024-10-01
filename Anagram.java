public class Anagram {
    public static void main(String[] args) {
        String s1="aba";
        String s2="baa";
        System.out.println(isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        int arr[]=new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }

        for (int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']+=1;
            arr[s2.charAt(i)-'a']-=1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0) return false;
        }


        return true;
    }
}
