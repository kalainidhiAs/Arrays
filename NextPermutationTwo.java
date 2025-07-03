package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutationTwo {
    static List<Integer> nextPermutation(int N, int arr[]) {
        // code here
        int i = N - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }

        if (i > 0) {
            int j = N - 1;
            while (arr[j] <= arr[i - 1]) {
                j--;
            }
            swap(arr, i - 1, j);
        }

        reverse(arr, i, N - 1);

        // Convert the array to a List and return it
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int N = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));

        List<Integer> nextPerm = NextPermutationTwo.nextPermutation(N, arr);

        System.out.println("Next Permutation: " + nextPerm);
    }
}
