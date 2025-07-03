package Array;

import java.util.Arrays;

public class ThreeWayPartitioning {
    public static void partition(int arr[], int a, int b) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int i = 0;

        while (i <= high) {
            if (arr[i] < a) {
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
                low++;
                i++;
            } else if (arr[i] >= a && arr[i] <= b) {
                i++;
            } else {
                int temp = arr[high];
                arr[high] = arr[i];
                arr[i] = temp;
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 4, 6, 8, 0 };
        int a = 2;
        int b = 6;
        partition(arr, a, b);
    }
}
