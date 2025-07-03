package Array;

import java.util.Arrays;

public class TripletsWithZero {
    public static boolean findTriplets(int arr[], int n) {
        // add code here.
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0)
                    return true;
                else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 0, -1, 2, -3, 1 };
        int n = arr.length;
        System.out.println(findTriplets(arr, n));
    }
}
