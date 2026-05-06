class Solution {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for(int i=0; i<nums.length; i++){
            if(i > reach) return false; //If current index is beyond our reachable range
            reach = Math.max(reach,  i+nums[i]);    // farthest reachable 
        }
        return true;    // loop finished reached the end
    }
}