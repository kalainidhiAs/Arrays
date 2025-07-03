package Array;

public class bestTimeToSellStocks {
    public static int sellstocks(int prices[]) {
        int minprice = prices[0];
        int maxprofit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit = sellstocks(prices);
        System.out.println(profit);
    }
}
