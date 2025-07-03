package Array;

public class MaxSumWithoutAdjacent {
    static int findMaxSum(int arr[], int n) {
        // code here
        int icurrent = arr[0];
        int ecurrent = 0;

        for (int i = 1; i < n; i++) {
            int newicurrent = ecurrent + arr[i];
            int newecurrent = Math.max(icurrent, ecurrent);

            icurrent = newicurrent;
            ecurrent = newecurrent;
        }
        return Math.max(icurrent, ecurrent);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 5, 10, 100, 10, 5 };
        int n = arr.length;
        int result = findMaxSum(arr, n);
        System.out.println("Maximum Sum of Non-Adjacent Subsequence: " + result);
    }
}
