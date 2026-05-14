class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        while(l <= r){
            int m = (r-l)/2 + l;
            if(nums[m] == target) return m; 
            else if(nums[l] < nums[m]){                              // left half sorted
                if(nums[l] <= target && target < nums[m]) r = m - 1; // lies in left part
                else l = m + 1;
            }
            else{                                                    // right half sorted
                if(nums[m] <= target && target < nums[r]) l = m + 1; // lies in right half
                else r = m - 1; 
            }
        }
        return -1;                                               // not found
    }
}