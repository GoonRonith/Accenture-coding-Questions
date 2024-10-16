public class OneAndZeroEncode {
    public static void main(String[] args) {
        String s="10111110101111"; 
        System.out.println(Encode(s));
    }
    public static String Encode(String s){
        int temp='A'-1;  //Internal typecasting
        int count=0;
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1'){
                count++;
            }
            else if(count>0){
                ans=ans+(char)(temp+count);
                count=0;
            }
        }
        if(count>0){
            ans=ans+(char)(temp+count);
        }
        
        return ans;
    }
}