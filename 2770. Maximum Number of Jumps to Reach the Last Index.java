class Solution {
    public int maximumJumps(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[n];                  // max to reach ith
        Arrays.fill(dp,-1);                     // not reachable
        dp[0] = 0;                              // base 
        for(int i=1; i<n; i++){                 // ith postion 
            for(int j=0; j<i; j++){             // checks prev positions
                if(Math.abs((long)nums[i] - nums[j]) <= target && dp[j] != -1){ // Valid jump and prev ind reachable
                    dp[i] = Math.max(dp[i], 1+dp[j]);   // either ith value or prev+1
                }
            }
        }
        return dp[n-1];                         // return max jumps
    }
}