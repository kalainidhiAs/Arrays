package Array;

public class NumberOfOccurenceOfX {

    static int count(int[] arr, int n, int x) {
        int firstIndex = findFirstIndex(arr, n, x);
        int lastIndex = findLastIndex(arr, n, x);

        if (firstIndex == -1 || lastIndex == -1) {
            return 0;
        }

        return lastIndex - firstIndex + 1;
    }

    static int findFirstIndex(int[] arr, int n, int x) {
        int low = 0, high = n - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1; // Continue searching towards the left
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    static int findLastIndex(int[] arr, int n, int x) {
        int low = 0, high = n - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1; // Continue searching towards the right
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
        int n = arr.length;
        int k = 3;
        System.out.println(count(arr, n, k));
    }

}
