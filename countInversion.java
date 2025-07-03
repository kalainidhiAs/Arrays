package Array;

public class countInversion {
    public static int GetInversionCount(int arr[]) {
        return mergesort(arr, 0, arr.length - 1);
    }

    public static int mergesort(int arr[], int left, int right) {
        int inversionCount = 0;

        if (left < right) {
            int mid = left + (right - left) / 2;
            System.out.println("mid : " + mid);

            inversionCount += mergesort(arr, left, mid);
            // System.out.println("IC 1st " + left + " " + mid);
            // System.out.println("IC 1st " + inversionCount);
            inversionCount += mergesort(arr, mid + 1, right);
            System.out.println("IC 2nd " + (mid + 1) + " " + right);
            // System.out.println("IC 2nd " + inversionCount);

            // System.out.println("IC final " + left + " " + mid + " " + right);
            inversionCount += merge(arr, left, mid, right);

            // System.out.println("IC count " + inversionCount);
            // System.out.println(inversionCount);
        }

        return inversionCount;
    }

    public static int merge(int arr[], int left, int mid, int right) {
        int temp[] = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        int inversionCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {

                inversionCount += mid - i + 1;
                temp[k++] = arr[j];
                j++;
            }
            // System.out.println("array 1: " + Arrays.toString(temp));
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // System.out.println(Arrays.toString(temp));

        for (i = 0; i < k; i++) {
            arr[left + i] = temp[i];
            // System.out.println("array 2: " + Arrays.toString(arr));
        }

        // System.out.println("inversion count: " + inversionCount);
        return inversionCount;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println(GetInversionCount(arr));
    }
}

/*
 * Let's trace this code using an example to count inversions in the array:
 * 
 * ### Example:
 * Consider the array `arr[] = {2, 4, 1, 3, 5}`. This has `N = 5`.
 * 
 * Inversions are pairs `(i, j)` such that `i < j` and `arr[i] > arr[j]`. For
 * the given array, inversions are:
 * 
 * - `(4, 1)`
 * - `(4, 3)`
 * - `(2, 1)`
 * 
 * So, the number of inversions should be 3.
 * 
 * ### Step-by-Step Execution:
 * 
 * 1. **Initial Function Call:**
 * - The `inversionCount` function is called with `arr = {2, 4, 1, 3, 5}` and `N
 * = 5`.
 * - Inside `inversionCount`, the `mergesort` function is called with `left = 0`
 * and `right = 4`.
 * 
 * 2. **First Level of Recursion (Full Array):**
 * - `mergesort(arr, 0, 4)` is called. The midpoint `mid = (0 + 4) / 2 = 2`.
 * 
 * 3. **Second Level of Recursion (Left Half):**
 * - `mergesort(arr, 0, 2)` is called. The midpoint `mid = (0 + 2) / 2 = 1`.
 * 
 * 4. **Third Level of Recursion (Left-Left Half):**
 * - `mergesort(arr, 0, 1)` is called. The midpoint `mid = (0 + 1) / 2 = 0`.
 * 
 * 5. **Fourth Level of Recursion (Left-Left-Left Half):**
 * - `mergesort(arr, 0, 0)` is called. Since `left == right`, this call returns
 * `0`.
 * 
 * 6. **Fourth Level of Recursion (Left-Left-Right Half):**
 * - `mergesort(arr, 1, 1)` is called. Since `left == right`, this call returns
 * `0`.
 * 
 * 7. **Merge Left-Left Half:**
 * - `merge(arr, 0, 0, 1)` is called. The subarrays are:
 * - Left subarray: `{2}`
 * - Right subarray: `{4}`
 * - During the merge, since `2 <= 4`, no inversion is counted. The merged
 * subarray remains `{2, 4}`.
 * 
 * 8. **Third Level of Recursion (Left-Right Half):**
 * - `mergesort(arr, 2, 2)` is called. Since `left == right`, this call returns
 * `0`.
 * 
 * 9. **Merge Left Half:**
 * - `merge(arr, 0, 1, 2)` is called. The subarrays are:
 * - Left subarray: `{2, 4}`
 * - Right subarray: `{1}`
 * - During the merge:
 * - Compare `2` with `1`. Since `2 > 1`, inversion is counted for elements in
 * the left subarray (2 and 4). So, inversion count increases by `2`. The merged
 * subarray becomes `{1, 2, 4}`.
 * - Total inversion count: `2`.
 * 
 * 10. **Second Level of Recursion (Right Half):**
 * - `mergesort(arr, 3, 4)` is called. The midpoint `mid = (3 + 4) / 2 = 3`.
 * 
 * 11. **Third Level of Recursion (Right-Left Half):**
 * - `mergesort(arr, 3, 3)` is called. Since `left == right`, this call returns
 * `0`.
 * 
 * 12. **Third Level of Recursion (Right-Right Half):**
 * - `mergesort(arr, 4, 4)` is called. Since `left == right`, this call returns
 * `0`.
 * 
 * 13. **Merge Right Half:**
 * - `merge(arr, 3, 3, 4)` is called. The subarrays are:
 * - Left subarray: `{3}`
 * - Right subarray: `{5}`
 * - During the merge, since `3 <= 5`, no inversion is counted. The merged
 * subarray remains `{3, 5}`.
 * - Total inversion count: `0`.
 * 
 * 14. **Merge Full Array:**
 * - `merge(arr, 0, 2, 4)` is called. The subarrays are:
 * - Left subarray: `{1, 2, 4}`
 * - Right subarray: `{3, 5}`
 * - During the merge:
 * - Compare `1` with `3`. Since `1 <= 3`, no inversion is counted.
 * - Compare `2` with `3`. Since `2 <= 3`, no inversion is counted.
 * - Compare `4` with `3`. Since `4 > 3`, inversion is counted for element `4`.
 * So, inversion count increases by `1`. The merged subarray becomes `{1, 2, 3,
 * 4, 5}`.
 * - Total inversion count: `1`.
 * 
 * ### Final Result:
 * - The total inversion count is `2 (from Left Half) + 1 (from Full Array
 * Merge) = 3`.
 * 
 * Thus, the inversion count for the array `{2, 4, 1, 3, 5}` is `3`.
 * 
 * ### Final Sorted Array:
 * - The array after all merges is `{1, 2, 3, 4, 5}`.
 * 
 * This shows how the merge sort technique is used to count inversions while
 * sorting the array.
 */