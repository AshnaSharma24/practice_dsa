class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for(String word : dictionary){      
            // only if word is subseq of s                                                
            if(IsSubsequence(s, word)){                                                     
                //Update answer if: 1. word is longer than current ans OR 2. Same length but lexicographically smaller
                if( word.length() > ans.length()    ||    ans.length() == word.length() && word.compareTo(ans)<0) ans = word;   
            }
        }
        return ans;
    }
    public boolean IsSubsequence(String s, String w){
        int i = 0;                                      // pointer for sub 
        int j = 0;                                      // pointer for word
        while(i<s.length() && j<w.length()){            // traverse both strings
            if(s.charAt(i) == w.charAt(j)) j++;         // only when char match move w point 
            i++;                                        // Always move s pointer
        }
        return j == w.length();                         // if j reached end, whole word matched
    }
}