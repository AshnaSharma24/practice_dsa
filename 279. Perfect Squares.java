class Solution {
    public int numSquares(int n) {
        if(isSquare(n)) return 1;           // if itself ans
        while(n % 4 == 0) n /= 4;           // remove powers of 4 acc to theorm
        if(n % 8 == 7) return 4;            // is rem  == 7 then always ans 4
        for(int i=1; i*i <= n; i++){
            if(isSquare(n - i*i)) return 2; // check if sum of 2 perfect sq
        }
        return 3;                           // if none of the above then 3
    }
    public boolean isSquare(int n){
        int root = (int) Math.sqrt(n);
        return root*root == n;
    }
}
// acc to a math theorm ans can be from 1 to 4 ,only A number requires 4 squares iff it looks like: n=4^a(8b+7)
