/*
 * N light bulbs are connected by a wire.Each bulb has a switch associated with it,however due to faulty wiring 
 * a switch also change the state of all the bulbs present at the right side of the current bulb.given state of all
 * bulbs in a array find minimum number of switches u have to press to turn on all the bulbs.0->off,1->on
 * a=[0,1]
 * output->2
 */

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
