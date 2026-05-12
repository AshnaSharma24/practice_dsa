// Way 1 => Recursion + Memoization (Top Down DP)
// Time: O(m * n)
// Space: O(m * n)

class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        return paths(0,0,m,n);                 // recursion
    }
    public int paths(int r, int c, int m, int n){
        if(r==m-1 && c==n-1) return 1;              // reached end
        if(r>=m || c>=n) return 0;                  // out of reach
        if(dp[r][c] != 0) return dp[r][c];          // already calculated
        return dp[r][c] = paths(r,c+1,m,n) + paths(r+1,c,m,n);   // right + down
    }
}

// ===============================================================================================