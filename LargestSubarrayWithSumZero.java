package Array;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {
    public static int findMaxLength(int[] arr, int n) {
        HashMap<Integer, Integer> sumofIndex = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {

            if (n == 1 && arr[0] == 0) {
                return 1;
            }

            if (arr[i] == 0) {
                arr[i] = -1;
            }

            sum += arr[i];

            if (sum == 0) {
                maxLength = i + 1;
            }

            if (sumofIndex.containsKey(sum)) {
                int previousIndex = sumofIndex.get(sum);
                maxLength = Math.max(maxLength, i - previousIndex);
            } else {
                sumofIndex.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int n = arr.length;
        System.out.println("max Length of subArray: " + findMaxLength(arr, n));
    }
}
