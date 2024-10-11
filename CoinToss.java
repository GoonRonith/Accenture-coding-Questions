/*
 * Objective: Write a program that simulates the process of counting scores based on a series of coin tosses, represented by a string. Each toss is either a heads ('h') or tails ('t'). The program will compute a score based on the following rules:

For each heads ('h'), add 2 points to the score.
For each tails ('t'), subtract 1 point from the score.
If there are 3 consecutive heads, the game ends immediately, and the score up to that point is returned.
Your task is to implement the method toss(String s) that takes a string s (representing a sequence of tosses) and returns the score based on the above rules.
 */
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
            System.out.println(score+" score");
            if(consecutiveHeadCount==3) break;
        }

        return score;
    }
}