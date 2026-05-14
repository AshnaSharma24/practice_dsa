class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1;
        while(l<r){
            int mid = l +(r-l)/2;
            if(nums[mid] > nums[r]) l = mid + 1;  // min must be in the right half
            else r = mid;                         // min is in left including mid
        }
        return nums[l];   // when l==r then min found
    }
}

// for time complexity O(log n) we can use binary search as the array is sorted and rotated.
// else normal linear search can be used with time complexity O(n)