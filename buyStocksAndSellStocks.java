package Array;

import java.util.ArrayList;

public class buyStocksAndSellStocks {
    // Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        // Initialize variables to keep track of buying and selling days
        int buyDay = 0;

        for (int i = 1; i < n; i++) {
            // If the stock price on the current day is higher than the previous day,
            // consider selling on the current day.
            if (A[i] > A[i - 1]) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(buyDay); // Buy day
                pair.add(i); // Sell day
                output.add(pair);
            } else {
                // If the stock price decreases, update the buyDay to the current day.
                buyDay = i;
            }
        }

        System.out.println(output);
        return output;
    }

    public static void main(String[] args) {
        int A[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = A.length;

        buyStocksAndSellStocks stockCalculator = new buyStocksAndSellStocks();
        ArrayList<ArrayList<Integer>> result = stockCalculator.stockBuySell(A, n);

        // Printing the buy and sell days for max profit
        for (ArrayList<Integer> pair : result) {
            System.out.println("Buy on day " + pair.get(0) + " and sell on day " + pair.get(1));
        }
    }
}
