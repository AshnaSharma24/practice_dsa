class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lastpos[] = new int[128];       // ek char latest kaha dekha
        int llen=0;                         // longest length
        int left=0;                         // left pointer of the window
        Arrays.fill(lastpos,-1);            // not seen any yet if -1
        for(int right=0; right<s.length(); right++){
            char c  = s.charAt(right);
            if(lastpos[c] >= left){  left = lastpos[c]+1;  }   //checks the previous occurrence of this character is inside the window → duplicate.
            lastpos[c] = right;                                // update the latest position of this character
            llen = Math.max(llen,right-left+1);                // longest selection
        }
        return llen;
    }
}