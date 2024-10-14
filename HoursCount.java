/*
 in an array all the a[i] represents the minutes you have to count the pairs whose sum represents the full hour..
 */
import java.util.*;;
public class HoursCount {
    public static void main(String[] args){
        int a[]={2,2,58,60,60,120};
        HashMap<Integer,Integer> map=new HashMap<>();
        int pairsCount=0;
        for (int i = 0; i < a.length; i++) {
            int difference=Math.abs(60-a[i]);
            if(map.containsKey(difference)){
                pairsCount=pairsCount+map.get(difference);
            }
            if(a[i]==60){
                map.put(a[i]%60, map.getOrDefault(a[i], 0)+1);
            }
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        // System.out.println(map);
        System.out.println(pairsCount);
    }
}
