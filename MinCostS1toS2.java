import java.util.HashMap;

public class MinCostS1toS2 {
    public static void main(String[] args) {
        String s1="xyz";
        String s2="axyzzkl";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)+1);
        }
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i)) && map.get(s1.charAt(i))>0 ){
                map.put(s1.charAt(i), map.get(s1.charAt(i))-1);
            }
        }
        int ans=0;
        for(int val:map.values()){
            ans+=val;
        }
        System.out.println(map);
        System.out.println(ans);
    }
}
