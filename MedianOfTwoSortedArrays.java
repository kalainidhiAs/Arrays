package Array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static double medianOfArrays(int m, int n, int a[], int b[]) {

        int i = 0, j = 0, k = 0;

        int mergedarr[] = new int[n + m];

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                mergedarr[k] = a[i];
                i++;
                k++;
            } else {
                mergedarr[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            mergedarr[k] = a[i];
            i++;
            k++;
        }

        while (j < n) {
            mergedarr[k] = b[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(mergedarr));

        if (mergedarr.length % 2 != 0) {
            return mergedarr[mergedarr.length / 2];
        } else {
            int mid1 = (mergedarr.length / 2) - 1;
            int mid2 = mergedarr.length / 2;

            return (double) (mergedarr[mid1] + mergedarr[mid2]) / 2;
        }

    }

    public static void main(String[] args) {
        int m = 3;
        int n = 4;

        int a[] = { 1, 5, 7 };
        int b[] = { 2, 3, 6, 7 };

        double result = medianOfArrays(m, n, a, b);
        System.out.println(result);

    }
}