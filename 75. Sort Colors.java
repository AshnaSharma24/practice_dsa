class Solution {
    public void sortColors(int[] nums) {
        int l=0, tracker=0, h=nums.length-1;
        while(tracker <= h){
            if(nums[tracker] == 0){         // if 0 then put in left region
                int t = nums[l];
                nums[l] = nums[tracker];
                nums[tracker] = t;
                l++;
                tracker++;
            }
            else if(nums[tracker] == 1) tracker++;  // if 1 then alredy ok place
            else{
                int t = nums[tracker];              // if 2 move to right region
                nums[tracker] = nums[h];
                nums[h] = t;
                h--;                                
            }
        }
    }
}