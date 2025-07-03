package Array;

import java.util.Arrays;

public class NumberOfCoins {

    public static int minCoins(int coins[], int rs, int n) {
        int[] dp = new int[rs + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        // Base case: 0 coins needed to make change for 0 cents
        dp[0] = 0;

        // Compute minimum coins needed for each value from 1 to V
        for (int i = 1; i <= rs; i++) {
            for (int j = 0; j < n; j++) {

                // If the current coin is less than or equal to the current value
                if (coins[j] <= i) {
                    int subproblem = dp[i - coins[j]];
                    if (subproblem != Integer.MAX_VALUE && subproblem + 1 < dp[i]) {
                        dp[i] = subproblem + 1;
                    }
                }
                // System.out.println(Arrays.toString(dp) + i + " " + j);
            }
        }
        // If dp[V] is still Integer.MAX_VALUE, no combination of coins can make the
        // change
        return dp[rs] == Integer.MAX_VALUE ? -1 : dp[rs];
    }

    public static void main(String[] args) {
        int[] coins = { 2, 1, 3 };
        int rs = 5;
        int n = coins.length;

        System.out.println("Output 1: " + minCoins(coins, rs, n)); // Output: 2

    }
}
