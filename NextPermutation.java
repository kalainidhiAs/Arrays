package Array;

import java.util.Arrays;

public class NextPermutation {
    public static int[] permutation(int arr[]) {
        int len = arr.length - 1; // Corrected the length calculation.

        int i = len;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }

        // System.out.println(i);

        if (i > 0) {
            int j = len;
            while (arr[j] <= arr[i - 1]) {
                j--;
            }

            swap(arr, i - 1, j);
        }

        // Arrays.sort(arr, i, len);

        reverse(arr, i, len); // Pass the correct indices.

        return arr;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        // System.out.println("hi");
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 8, 1, 4 };
        int result[] = permutation(arr);
        System.out.println(Arrays.toString(result));
    }
}
