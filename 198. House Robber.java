class Solution {
    Integer dp[];
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new Integer[n+1];
        return helper(nums,0,n);
    }
    public int helper(int nums[], int i, int n){
        if(i>=n) return 0;
        if(dp[i] != null) return dp[i];
        int take = nums[i] + helper(nums,i+2,n);
        int not_take = helper(nums,i+1,n);
        return dp[i] = Math.max(take,not_take);
    }
}