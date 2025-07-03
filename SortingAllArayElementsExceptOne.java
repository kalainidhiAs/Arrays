package Array;

import java.util.Arrays;

public class SortingAllArayElementsExceptOne {
    public static int[] sortExcept(int arr[], int k, int n) {
        swap(arr, k, n - 1);
        Arrays.sort(arr, 0, n - 1);
        swap(arr, k, n - 1);
        Arrays.sort(arr, k + 1, n);

        return arr;
    }

    private static void swap(int arr[], int k, int n) {
        int temp = arr[k];
        arr[k] = arr[n];
        arr[n] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 4, 11, 7, 6, 20 };
        int k = 2;
        int n = arr.length;
        int result[] = sortExcept(arr, k, n);
        System.out.println(Arrays.toString(result));

    }
}
