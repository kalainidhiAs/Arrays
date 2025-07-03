package Array;

public class Coins {
    public static int countCoin(int coins[], int sum) {
        int dp[] = new int[sum + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            for (int j = 1; j <= sum; j++) {
                if (j - coin >= 0) {
                    dp[j] += dp[j - coin];
                }
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int[] coins = { 1, 2, 3 };
        int sum = 4;
        System.out.println(countCoin(coins, sum));
    }
}
