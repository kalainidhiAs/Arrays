package Array;

import java.util.Arrays;

public class LengthUnsortedSubarray {
    public static int[] length(int arr[]) {

        int left = 0;
        int right = arr.length - 1;
        while (left < arr.length - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        while (left == right) {
            return new int[] { 0, 0 };
        }

        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }
        System.out.println(left);
        System.out.println(right);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {

            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        while (left >= 0 && arr[left] > min) {
            left--;
        }

        while (right <= arr.length - 1 && arr[right] < max) {
            right++;
        }

        return new int[] { left + 1, right - 1 };
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 15, 25, 6, 7, 30, 40, 50 };
        System.out.println(Arrays.toString(length(arr)));

    }
}
