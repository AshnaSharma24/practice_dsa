class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int pre = 1,  post = 1; // left side prod , r side prod except itself
        for(int i=0;i<n;i++){ 
            res[i] = pre;      // before multi ith no, store product of everything left of i
            pre *= nums[i];    // update pre for next 
        }
        for(int i=n-1; i>=0; i--){
            res[i] *= post;      //res[i] already has LEFT product multi RIGHT prod for ans
            post *= nums[i];     // update post for next
        }
        return res;
    }
}
// basically res[i] = prod of left side * prod of right side