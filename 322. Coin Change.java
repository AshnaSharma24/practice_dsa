class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];                                       // min coin to make ith amt
        Arrays.fill(dp,amount+1);                                           // max coins cant be more than amt
        dp[0] = 0;                                                          // 0 needed to make 0 base case
        for(int i=1; i<=amount; i++){                                       // loop all amts from 1 to amt
            for(int coin : coins){                                          // use each coin senario
                if(coin <= i) dp[i] = Math.min(dp[i], 1+dp[i-coin]);    // either exsisting value / cur coin + sol remaining for amt 
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];   // if sol>amt return -1
    }
}