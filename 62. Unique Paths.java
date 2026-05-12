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
// Way 2 => Tabulation (Bottom Up DP)
// Time: O(m * n)
// Space: O(m * n)

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++) dp[i][0] = 1;    // 1st col == 1 cz only move down 
        for(int j=0; j<n; j++) dp[0][j] = 1;    // 1st row == 1 cz only move right
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];      // cur = prev row (top) + prev col(left)
            }
        }
        return dp[m - 1][n - 1];
    }
}


// ===============================================================================================
// Way 3 => Tabulation with Space Optimization
// Time: O(m * n)   
// Space: O(n)


class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];    // Each ind stores no of ways to reach that column
        Arrays.fill(dp, 1);       // row always has only 1 path
        // start from 2nd row 
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[j] = dp[j] + dp[j-1];      // Cur = Top Ways + Left Ways
            }
        }
        return dp[n - 1];
    }
}

// only prev row needed
// dp[j]= TOP value , because array still stores previous row value.
// AND
// dp[j-1] = LEFT value , because current row already updated left side.