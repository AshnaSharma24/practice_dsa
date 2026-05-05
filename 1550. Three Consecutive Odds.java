class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int x : arr){
            if((x & 1) == 1){   // odd & 1 is 1, even is 0 faster then %2 ==0/1 condition
                count++;   // if odd count inc
                if(count == 3) return true; 
            }
            else count = 0; // reset if even 
        }
        return false;
    }
}