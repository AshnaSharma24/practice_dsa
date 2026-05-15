class Solution {
    public int getSum(int a, int b) {
        //loops until b == 0 so no carry a is answer;
        while(b != 0){                // ie carry != 0
            int sum = a ^ b;          // ^ gives sum without carry
            int carry = (a & b) << 1; // & gives carry but it needs to be put in next so << 1
            a = sum;
            b = carry; 
        }
        return a;
    }
}

// Time Complexity: O(1) , because integers are fixed-size (32 bits) the loop runs at most 32 times.
// Space Complexity: O(1)


