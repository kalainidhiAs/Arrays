package Array;

import java.util.*;;

public class kth_smallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 5, 6, 9, 1 };
        int k = 4;

        System.out.println("K'th smallest element is " + arr[k - 1]);
    }
}