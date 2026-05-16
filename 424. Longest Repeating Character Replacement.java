class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxf = 0, ans = 0;
        int freq [] = new int[26];
        while(r < s.length()){
            char ch = s.charAt(r);
            freq[ch - 'A']++;
            maxf = Math.max(maxf, freq[ch - 'A']);
            if(r-l+1 - maxf > k){           // wind size - maxf > k ie replacements needed > k not valid
                freq[s.charAt(l) - 'A']--;  // remove left character from window so dec freq of char at l
                l++;                        // move l pointer shrink window
            }
            ans = Math.max(ans, r-l+1);     // max ans selection
            r++;                            // inc window
        }
        return ans;
    }
}