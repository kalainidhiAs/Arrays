package Array;

import java.util.*;

public class CountTriplets {
    int countTriplet(int arr[], int n) {
        // code here
        int count = 0;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i--) {
            int j = i - 1;
            int k = 0;
            while (k < j) {
                int sum = arr[k] + arr[j];
                if (sum == arr[i]) {
                    count++;
                    k++;
                    j--;
                } else if (sum < arr[i]) {
                    k++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        System.out.println(new CountTriplets().countTriplet(arr, arr.length));
    }
}
