package Array;

import java.util.Arrays;

public class AlternateSigns {
    public static void merge(int arr[], int n) {
        int posArr[] = new int[n];
        int negArr[] = new int[n];

        int posCount = 0;
        int negCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                posArr[posCount] = arr[i];
                posCount++;
            } else {
                negArr[negCount] = arr[i];
                negCount++;
            }
        }

        System.out.println(Arrays.toString(posArr));
        System.out.println(Arrays.toString(negArr));

        int i = 0, j = 0, k = 0;
        boolean positiveTurn = true;
        while (i < posCount && j < negCount) {
            if (positiveTurn) {
                arr[k] = posArr[i];
                i++;
                k++;
            } else {
                arr[k] = negArr[j];
                j++;
                k++;
            }
            positiveTurn = !positiveTurn;
        }

        while (i < posCount) {
            arr[k] = posArr[i];
            i++;
            k++;
        }

        while (j < negCount) {
            arr[k] = negArr[j];
            j++;
            k++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, -6, -7, -8, -9, 1, 2, 3, 4, -3 };
        int n = arr.length;
        merge(arr, n);
    }
}
