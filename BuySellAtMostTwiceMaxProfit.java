package Array;

import java.util.Arrays;

public class BuySellAtMostTwiceMaxProfit {
    public static int maxprofit(int arr[], int n) {
        int leftProfit[] = new int[n];
        int rightProfit[] = new int[n];

        int minPrice = arr[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            leftProfit[i] = Math.max(leftProfit[i - 1], arr[i] - minPrice);
        }
        System.out.println(Arrays.toString(leftProfit));

        int maxPrice = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, arr[i]);
            // System.out.println(maxPrice + " ");
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - arr[i]);
            // System.out.println(Arrays.toString(rightProfit));
        }
        System.out.println(Arrays.toString(rightProfit));

        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            maxprofit = Math.max(maxprofit, leftProfit[i] + rightProfit[i]);
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 10, 22, 5, 75, 65, 80 };
        int n = prices.length;
        int profit = maxprofit(prices, n);
        System.out.println(profit);
    }
}
