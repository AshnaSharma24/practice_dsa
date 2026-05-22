class Solution {
    public int countSegments(String s) {
        int res = 0;
        for(int i=0; i<s.length(); i++){
            // if ith isnt space AND either its 1st char or prev was space count it
            if(s.charAt(i) != ' ' && ( i == 0 || s.charAt(i-1) == ' ')) res++;   
        }
        return res;
    }
}


// ====================================


class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }
}

