package Array;

public class countInversionLong {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        return mergeSortAndCount(arr, 0, N - 1);
    }

    static long mergeSortAndCount(long arr[], long left, long right) {
        long inversionCount = 0;

        if (left < right) {
            long mid = left + (right - left) / 2;

            // Recursive calls for the left and right subarrays
            inversionCount += mergeSortAndCount(arr, left, mid);
            inversionCount += mergeSortAndCount(arr, mid + 1, right);

            // Merge the two sorted halves and count inversions
            inversionCount += mergeAndCount(arr, left, mid, right);
        }

        return inversionCount;
    }

    static long mergeAndCount(long arr[], long left, long mid, long right) {
        long[] temp = new long[(int) (right - left + 1)];
        long i = left;
        long j = mid + 1;
        long k = 0;
        long inversionCount = 0;

        while (i <= mid && j <= right) {
            if (arr[(int) i] <= arr[(int) j]) {
                temp[(int) k++] = arr[(int) i++];
            } else {
                // If arr[i] > arr[j], it forms inversions with the elements in the left
                // subarray
                inversionCount += mid - i + 1;
                temp[(int) k++] = arr[(int) j++];
            }
        }

        // Copy the remaining elements of the left subarray
        while (i <= mid) {
            temp[(int) k++] = arr[(int) i++];
        }

        // Copy the remaining elements of the right subarray
        while (j <= right) {
            temp[(int) k++] = arr[(int) j++];
        }

        // Copy the merged elements back to the original array
        for (i = 0; i < k; i++) {
            arr[(int) (left + i)] = temp[(int) i];
        }

        return inversionCount;
    }

    public static void main(String[] args) {
        long arr[] = { 4, 1, 3, 6, 2 };
        long N = arr.length;
        System.out.println("Number of inversions: " + inversionCount(arr, N));
    }
}
