package Array;

import java.util.Arrays;

public class RightRotation {
    public static void rightRotate(int arr[], int n, int k) {
        int rotate[] = new int[n];

        for (int i = 0; i < n; i++) {
            int rotateIndex = (i + k) % n;
            rotate[rotateIndex] = arr[i];
        }

        System.arraycopy(rotate, 0, arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;
        rightRotate(arr, n, k);
    }
}
