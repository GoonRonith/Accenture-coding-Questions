import java.util.*;
public class ThreeMultiplication {
    public static void main(String[] args) {
        int a[]={9,18,2,1,4};
        int target = 36;
        ArrayList<ArrayList<Integer>> ans=getTriplets(a,target);
        System.out.println(ans);

    }
    public static ArrayList<ArrayList<Integer>> getTriplets(int[] a,int target){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]) continue;
            int j=i+1;
            int k=a.length-1;
            while (j<k) {
                int multi=a[i]*a[j]*a[k];
                if(multi==target){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(a[i]);
                    temp.add(a[j]);
                    temp.add(a[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j<k && a[j]==a[j-1]) continue;
                    while (j<k && a[k]==a[k-1]) continue;
                }
                else if(multi < target) j++;
                else k--;
            }
        }
        return ans;
    }
}
