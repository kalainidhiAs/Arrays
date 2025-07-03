package Array;

import java.util.Arrays;

public class MinimumPlatform {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int maxPlatform = 1;
        int neededPlatform = 1;

        int i = 1, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                maxPlatform++;
                i++;
            } else if (arr[i] > dep[j]) {
                maxPlatform--;
                j++;
            }

            if (maxPlatform > neededPlatform) {
                neededPlatform = maxPlatform;
            }
        }

        return neededPlatform;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 1100, 1235 };
        int dep[] = { 1010, 1200, 1240 };
        int n = arr.length;

        int result = findPlatform(arr, dep, n);

        System.out.println("Minimum number of platforms required: " + result);
    }
}
