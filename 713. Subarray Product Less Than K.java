class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;                      // no valid sub  possible
        int r=0, l=0, cnt=0, prod=1;
        while(r < nums.length){
            prod *= nums[r];                    // expand window
            while(prod >= k) prod /= nums[l++]; // shrink till it becomes valid window
            cnt += r-l+1;                       // Count all valid subarr ending at r
            r++;
        }
        return cnt;
    }
}