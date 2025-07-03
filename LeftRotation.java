package Array;

import java.util.Arrays;

public class LeftRotation {
    public static void leftRotate(long arr[], int k, int n) {
        k %= n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(long arr[], int start, int end) {
        while (start < end) {
            long temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        long arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 2;
        leftRotate(arr, n, k);
    }
}

// int indexx = (i+(n-k))%n;