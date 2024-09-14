public class OccurenceO2ndLargestElm {
    public static void main(String[] args) {
        int []a={1,2,3,4,4,5,5,5,6,6,6,6,6};
        int secondLargest=0;;
        int largest=a[a.length-1];
        int cnt=0;
        boolean set=false;
        for(int i=a.length-1;i>=0;i--){
            if(set==false){
                if(largest > a[i]){
                    secondLargest=a[i];
                    cnt+=1;
                    set=true;
                }
            }
            else{
                if(secondLargest==a[i]) cnt+=1;
            }
            
        }
        System.out.println(cnt);
    }
}
