package Array;

public class MinSwapKtogether {
    public static void minswap(int arr[], int n, int k) {
        // count elements in array less than or equal to k.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }
        System.out.println("count: " + count);

        // Count the number of elements greater than k in the first window of size count
        int greaterThanK = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                greaterThanK++;
            }
        }
        System.out.println("greaterThanK: " + greaterThanK);

        // Initialize the minimum swaps needed to move all elements less than or equal
        // to k
        int minswapsRequired = greaterThanK;
        for (int i = 0, j = count; j < n; i++, j++) {
            // Update the count of elements greater than k in the current window
            if (arr[i] > k) {
                greaterThanK--;
            }

            if (arr[j] > k) {
                greaterThanK++;
            }

            minswapsRequired = Math.min(minswapsRequired, greaterThanK);
        }

        System.out.println("Minimum swap required : " + minswapsRequired);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 12, 20, 20, 5, 19, 19, 12, 1, 20, 1 };
        int k = 5;
        int n = arr.length;

        minswap(arr, n, k);
    }
}
