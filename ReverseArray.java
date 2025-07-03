package Array;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse(int arr[]) {
        int left = 0;
        int Right = arr.length - 1;

        while (left < Right) {
            int temp = arr[left];
            arr[left] = arr[Right];
            arr[Right] = temp;

            left++;
            Right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int result[] = reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}
