package Array;

import java.util.Arrays;

public class removeDupicate {
    public static int[] dupdicate(int arr[]) {
        int len = arr.length;
        int j = 0;

        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[len - 1];// adding last element in the array.

        int result[] = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = arr[i];
        }

        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 4, 5 };
        int newarr[] = dupdicate(arr);
        System.out.println(Arrays.toString(newarr));
    }
}
