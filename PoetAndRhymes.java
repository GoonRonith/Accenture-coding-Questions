public class PoetAndRhymes {
    public static void main(String[] args) {
        String s="thunder";
        String dict[]=new String[5];
        dict[0]="puzzle";
        dict[1]="thunder";
        dict[2]="powder";
        dict[3]="blunder";
        dict[4]="blender";
        int len=5;
        System.out.println(check(s,dict,len));
    }    
    public static String check(String s,String[] dict,int l){
        int ans=0;
        int ansIdx=0;
        for (int i = 0; i <l; i++) {
            int cnt=0;
            int idx1=dict[i].length()-1;
            int idx2=s.length()-1;
            if(!dict[i].equals(s)){
                while (idx1>=0) {
                    if(dict[i].charAt(idx1)==s.charAt(idx2)){
                        cnt++;
                    }
                    else{
                        break;
                    }
                    idx1--;
                    idx2--;
                }
                // System.out.println("cnt"+cnt);
                if(ans < cnt){
                    ans=cnt;
                    ansIdx=i;
                }
            }
        }
       
        return dict[ansIdx];
    }

}
