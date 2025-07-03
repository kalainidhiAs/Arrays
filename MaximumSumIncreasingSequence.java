package Array;

/**
 * MaximumSumIncreasingSequence
 */
public class MaximumSumIncreasingSequence {
    public int maxSumIS(int arr[], int n) {
        // code here.
        int mis[] = new int[n];
        for (int i = 0; i < n; i++) {
            mis[i] = arr[i];
        }

        int maxIncreasingSequence = arr[0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && arr[i] + mis[j] > mis[i]) {
                    mis[i] = arr[i] + mis[j];

                    maxIncreasingSequence = Math.max(maxIncreasingSequence, mis[i]);
                }
                // System.out.println(i + " " + j + " " + Arrays.toString(mis));
            }
        }

        return maxIncreasingSequence;
    }

    public static void main(String[] args) {
        int N = 5;
        int arr[] = { 1, 101, 2, 3, 100 };
        System.out.println(
                "Maximum Sum Increasing Subsequence is " + new MaximumSumIncreasingSequence().maxSumIS(arr, N));// 1 2 3
                                                                                                                // 100
    }
}