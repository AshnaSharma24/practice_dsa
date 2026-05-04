class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        boolean seen[] = new boolean[10001];    // too keep unique
        int l=0, r=0, max=0, sum=0;
        while(r<nums.length){
            if(!seen[nums[r]]){
                seen[nums[r]] = true;
                sum += nums[r];
                max = Math.max(max,sum);
                r++;
            }else{
                seen[nums[l]] = false;
                sum -= nums[l];
                l++;
            }
        }
        return max;
    }
}