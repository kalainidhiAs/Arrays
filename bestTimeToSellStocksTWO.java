package Array;

public class bestTimeToSellStocksTWO {
    public static int sellstocks2(int prices[], int n) {
        int maxprofit = 0;

        for (int i = 1; i < n - 1; i++) {
            if (prices[i] > prices[i - 1]) {
                // If the current day's price is higher than the previous day, buy and sell on
                // the same day.
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int n = prices.length;
        int profit = sellstocks2(prices, n);
        System.out.println(profit);
    }

}
