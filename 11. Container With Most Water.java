class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int maxArea = 0, currArea = 0;
        while(l<r){
            currArea = Math.min(height[l], height[r]) * (r-l);  
            maxArea = Math.max(currArea, maxArea);
            if(height[l] < height[r]) l++;
            else r--;
        }
        return maxArea;
    }
}