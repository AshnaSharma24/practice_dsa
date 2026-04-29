class Solution{
    public boolean IsVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
       public int maxVowels(String s, int k) {
        int cnt = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(IsVowel(s.charAt(i))) cnt++;  //is char is vowel count increase
            if(i>=k && IsVowel(s.charAt(i-k))) cnt--; //maintain window remove element, if vowel decrease count 
            if(i>=k-1) max = Math.max(max,cnt); //update max count of vowel in window
        }
        return max;
       }
}