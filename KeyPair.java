package Array;

import java.util.Arrays;

public class KeyPair {
    static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);

        int l = 0, r = n - 1;

        while (l < r) {
            if (arr[l] + arr[r] == x) {
                return true;
            } else if (arr[l] + arr[r] < x) {
                l++;
            } else {
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 8, 10 };
        int n = arr.length;
        int x = 16;
        System.out.println(hasArrayTwoCandidates(arr, n, x));
    }
}
