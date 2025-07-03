package Array;

public class PerfectSum {
    public static int perfectSum(int arr[], int n, int sum) {
        // Your code goes here
        int mod = 1000000007;
        int dp[] = new int[sum + 1];

        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = sum; j >= arr[i]; j--) {
                dp[j] += dp[j - arr[i]];
                dp[j] = dp[j] % mod;
            }
        }
        return dp[sum];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int sum = 7;
        System.out.println(perfectSum(arr, n, sum));
    }
}
