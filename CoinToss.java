public class CoinToss {

    public static void main(String[] args) {
        String s="hthhtththhht";
        System.out.println(toss(s));
    }

    public static int toss(String s){
        int score=0;
        int consecutiveHeadCount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='h') {
                consecutiveHeadCount+=1;
                score+=2;   
            }
            else {
                consecutiveHeadCount=0;
                score-=1;
            }
            
            if(consecutiveHeadCount==3) break;
        }

        return score;
    }
}