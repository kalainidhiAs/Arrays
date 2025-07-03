package Array;

import java.util.Arrays;

public class Rearrange {

    static void rearrangeArray(int[] arr, int n) {
        // code here
        int temp[] = new int[n];
        Arrays.sort(arr);

        int i = 0;
        int k = 0;
        int j = n - 1;
        while (i < n) {
            temp[i] = arr[k];
            i++;
            k++;
            if (i == n) {
                break;
            }
            System.out.println(Arrays.toString(temp));
            temp[i] = arr[j];
            i++;

            j--;

        }

        System.arraycopy(temp, 0, arr, 0, n);

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int n = 4;
        int arr[] = { 1, 4, 2, 6 };
        rearrangeArray(arr, n);
    }
}
