class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l<r){
            int mid = l +(r-l)/2;
            if(nums[mid] > nums[r]) l = mid + 1;  // min must be in the right half
            else if(nums[mid] < nums[r]) r = mid; // min is in left including mid
            else r--;     //when n[mid] == n[r], Even if nums[r] is min, removing one dup is safe
        }
        return nums[l];   // when l == r, both point to the min
    }
}