package Array;

import java.util.Arrays;

public class TrappingRainWater {
    public static long trapwater(int arr[], int n) {
        int left[] = new int[n];
        int right[] = new int[n];
        int max = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            left[i] = max;
        }
        System.out.println(Arrays.toString(left));

        max = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            right[i] = max;
        }
        System.out.println(Arrays.toString(right));

        long total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(left[i], right[i]) - arr[i];
            // System.out.println(total);
        }
        return total;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = arr.length;
        System.out.println(trapwater(arr, n));
    }
}
