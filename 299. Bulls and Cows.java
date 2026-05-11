public class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int freq [] = new int[10];      // store occ of digit , + then secret has, -ve guess wants
        for(int i=0; i<secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if(s == g) bulls++;                     // both at same corect position
            else{
                if(freq[s - '0'] < 0) cows++;       // guess was waiting for s
                if(freq[g - '0'] > 0) cows++;       // secret was waiting for g
            }
            freq[s-'0']++;                          // update at s ++
            freq[g-'0']--;                          // update at g --
        }
        return bulls+"A"+cows+"B";
    }
} {
    
}
