package Array;

import java.util.Arrays;

public class NextSmallestGreater {
    // Function for finding maximum and value pair
    public static int[] greaterElement(int arr[], int n) {
        // Complete the function
        int temp[] = arr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            arr[i] = binary(temp, 0, n - 1, arr[i]);
        }
        return arr;
    }

    public static int binary(int arr[], int i, int j, int key) {
        int nextGreater = -1;
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (arr[m] > key) {
                nextGreater = arr[m];
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return nextGreater;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25 };
        int n = arr.length;
        int[] result = greaterElement(arr, n);
        System.out.println(Arrays.toString(result)); // Output should be [5, 25, 4, -1]
    }
}
