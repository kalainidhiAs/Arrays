package Array;

import java.util.Arrays;

public class longestConsecutive {
    // Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N) {
        int maxcount = 1;
        int count = 1;
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxcount) {
                maxcount = count;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 8, 8, 9, 10, 11, 15, 16, 17, 18, 19 };
        int N = arr.length;
        int result = findLongestConseqSubseq(arr, N);
        System.out.println("Length of longest subsequence of consecutive integers: " + result);
    }
}
