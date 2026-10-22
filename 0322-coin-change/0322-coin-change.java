
import java.util.Arrays;

class Solution {

    public int countcoin(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 0;
        }
        if (i >= coins.length || amount < 0) {
            return 1000000;
        }
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }
        int take = 1000000;
        if (coins[i] <= amount) {
            take = 1 + countcoin(coins, amount - coins[i], i, dp);
        }
        int non_take = countcoin(coins, amount, i + 1, dp);
        dp[i][amount] = Math.min(take, non_take);
        return dp[i][amount];
    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = countcoin(coins, amount, 0, dp);
        return ans >= 1000000 ? -1 : ans;
    }
}
