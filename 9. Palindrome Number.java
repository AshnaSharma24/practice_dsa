class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int rev = 0;
        while (n > 0) {
            rev *= 10;
            rev += n % 10;
            n /= 10;
        }
        return rev == x;
    }
}