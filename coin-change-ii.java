class Solution {
    public int change(int amount, int[] coins) {
     if(amount==0||coins.length==0)return 1;
     if(coins.length==1 && coins[0]==amount)return 1;
     if(coins.length==1 && coins[0]!=amount&& coins[0]>amount)return 0;
        int[] dp = new int[amount+1];
        dp[0]=1;
        for(int coin : coins){
            for(int i = coin;i<amount+1;i++){
               dp[i]= dp[i]+dp[i-coin];
            }
        }     
        return dp[amount];
    }
}

