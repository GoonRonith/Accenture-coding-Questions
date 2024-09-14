public class sumOfprime {
    public static void main(String[] args) {
        int n=20;
        boolean[] flags = new boolean[n];
        for(int i=0;i<n;i++){
            flags[i]=true;
        }

        int start=2;
        while (start*start<n) {
            if(flags[start]){
                int j=start*2;
                while (j<n) {
                    flags[j]=false;
                    j+=start;
                }
            }
            start+=1;
        }
        int sum=0;
        for (int i = 2; i < flags.length; i++) {
            if(flags[i]) sum+=i;
        }
        System.out.println(sum);
    }   
}
