class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE; // ans
        int currsum = 0;                // current sub array sum
        for(int n : nums){
            currsum += n;
            maxsum = maxsum > currsum ? maxsum : currsum; // update ans with max value
            if(currsum < 0) currsum = 0; // if curr sum is -ve then start new sub array from next element
        }
        return maxsum;
    }
}