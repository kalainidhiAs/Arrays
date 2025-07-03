package Array;

import java.util.Arrays;

public class stockMaximumProfitAtKtimes {
    static int maxProfit(int K, int N, int A[]) {
        // code here
        int profit[] = new int[K + 1];
        int prevDiff[] = new int[K + 1];
        Arrays.fill(prevDiff, Integer.MIN_VALUE);

        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= K; j++) {
                prevDiff[j] = Math.max(prevDiff[j], profit[j - 1] - A[i]);
                // System.out.println(Arrays.toString(prevDiff));
                profit[j] = Math.max(profit[j], A[i] + prevDiff[j]);
                //
                System.out.println(Arrays.toString(profit));
            }
        }
        return profit[K];
    }

    public static void main(String[] args) {
        int K = 2, N = 6;
        int A[] = { 10, 22, 5, 75, 65, 80 };
        int result = maxProfit(K, N, A);
        System.out.println(result);
    }
}
