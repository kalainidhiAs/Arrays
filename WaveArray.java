package Array;

import java.util.Arrays;

public class WaveArray {
    public static void waveSort(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            // System.out.println(" 1st " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        waveSort(arr);

        // Print the sorted wave-like array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
 * for (int i = 0; i < n - 1; i += 2) {
 * sort(arr, i, i + 1);
 * System.out.println(" 1st " + Arrays.toString(arr));
 * 
 * if (i + 1 < n && arr[i] < arr[i + 1]) {
 * sort(arr, i + 1, i + 2);
 * }
 * System.out.println(" 2nd " + Arrays.toString(arr));
 * }
 * }
 */