class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int l=0, t=0;
        int b = matrix.length-1;
        int r = matrix[0].length-1;

        while(t<=b && l<=r){

            // l to r using top
            for(int i=l; i<=r; i++){
                ans.add(matrix[t][i]);
            }
            t++;

            //t to b use right
            for(int i=t; i<=b;i++){
                ans.add(matrix[i][r]);
            }
            r--;

            // again check to prevent repetition
            if(t<=b){
                for(int i=r; i>=l; i--){        // r to l
                    ans.add(matrix[b][i]);
                }
                b--;
            }

            // again check to prevent repetition
            if(l<=r){
                for(int i=b; i>=t; i--){        // b to t
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}