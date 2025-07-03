package Array;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraycurrentsum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();

        int currentsum = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            if (s == 0 && arr[i] == 0) {
                result.add(i + 1);
                result.add(i + 1);
                return result;
            }
        }

        while (right < n) {
            currentsum += arr[right];

            if (s == 0) {
                result.add(-1);
                return result;
            }

            while (currentsum > s) {
                currentsum -= arr[left];
                left++;
            }

            if (currentsum == s) {
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }

            right++;
        }

        result.add(-1);

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 0, 1 };
        int n = arr.length;

        int s = 0;
        ArrayList<Integer> result = subarraycurrentsum(arr, n, s);

        if (result.get(0) == -1) {
            System.out.println("No subarray found with the currentsum " + s);
        } else {
            System.out.println(
                    "Subarray with the currentsum " + s + " is found from index " + result.get(0) + " to "
                            + result.get(1));
        }
    }
}
/*
 * int right = 0, left = 0;
 * int currentsum = 0;
 * 
 * while (right < n) {
 * currentsum += arr[right];
 * 
 * if (s == 0) {
 * result.add(-1);
 * return result;
 * }
 * 
 * while (currentsum > s) {
 * currentsum -= arr[left];
 * left++;
 * }
 * 
 * if (currentsum == s) {
 * result.add(left + 1);
 * result.add(right + 1);
 * return result;
 * }
 * 
 * right++;
 * }
 * 
 * result.add(-1);
 */