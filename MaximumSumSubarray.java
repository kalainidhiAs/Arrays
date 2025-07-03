package Array;

public class MaximumSumSubarray {
    public static int maxsubarray(int arr[], int n) {
        int currentsum = arr[0];
        int maxsum = arr[0];

        for (int i = 1; i < n; i++) {
            // currentsum += arr[i];
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        System.out.println(maxsubarray(arr, n));
    }
}
