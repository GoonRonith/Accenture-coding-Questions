public class SwitchPress {
    public static void main(String[] args) {
        int a[]={0,1,0,1};
        int cnt=0;
        for(int i:a){
            if(cnt%2==0){
                if(i==0) cnt++;
            }
            else{
                if(i==1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
