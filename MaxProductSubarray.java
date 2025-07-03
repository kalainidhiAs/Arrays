package Array;

public class MaxProductSubarray {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long min = arr[0];
        long max = arr[0];
        long product = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < 0) {
                long temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(arr[i], max * arr[i]);
            min = Math.min(arr[i], min * arr[i]);

            product = Math.max(product, max);
        }
        return product;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        int n = arr.length;
        System.out.println("Maximum Product Subarray is " + new MaxProductSubarray().maxProduct(arr, n));
    }
}
