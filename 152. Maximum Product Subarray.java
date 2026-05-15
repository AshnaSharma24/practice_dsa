class Solution {
    public int maxProduct(int[] nums) {
        int leftp = 1, rightp = 1;  // prod from left side, from right side
        int ans = Integer.MIN_VALUE;    // max prod
        int n = nums.length;
        for(int i=0; i<n; i++){
            // start new sub array cz prod == 0 
            if(leftp == 0) leftp = 1;   
            if(rightp == 0) rightp = 1;

            leftp *= nums[i];       // l to r prod
            rightp *= nums[n-i-1];  // r to l prod

            ans = Math.max(ans, Math.max(leftp,rightp));   //choose the max prod from these 3  
        }
        return ans;
    }
}