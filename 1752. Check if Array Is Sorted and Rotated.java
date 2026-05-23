class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int rotated = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]) rotated++;    // pattern break ie rotated
        }
        if(nums[n-1] > nums[0]) rotated++;        // cz arr should be sorted circularlly too 
        return rotated <= 1;                //should be only once rotated
    }
}


// ---------------------------------------------------------------

class Solution {
    public boolean check(int[] nums) {
            int n = nums.length;
            int b = 0;                               //breaks in sequence
            for(int i = 0; i < n; ++i){
                if(nums[i] > nums[(i+1) %n])  b++;  // checks circularly too, if current is greater than next, its a break in sequence
                 if(b>1) return false;              // if more than 1 break, its not sorted and rotated
            }
            return true;
    }
}