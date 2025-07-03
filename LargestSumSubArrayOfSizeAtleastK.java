package Array;

public class LargestSumSubArrayOfSizeAtleastK {
    public static int maxSubarray(int arr[], int k, int n) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        int curSum = maxSum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            curSum = Math.max(curSum + arr[i], sum);
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        int k = 2;
        int n = arr.length;
        System.out.println(maxSubarray(arr, k, n));
    }
}
