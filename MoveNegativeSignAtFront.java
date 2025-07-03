package Array;

import java.util.Arrays;

public class MoveNegativeSignAtFront {
    public static void moveNegative(int arr[], int n) {
        int temparr[] = new int[n];

        int negativeNum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temparr[negativeNum] = arr[i];
                negativeNum++;
            }
        }
        System.out.println(Arrays.toString(temparr));

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temparr[negativeNum] = arr[i];
                negativeNum++;
            }
        }
        System.out.println(Arrays.toString(temparr));
    }

    public static void main(String[] args) {
        int arr[] = { 7, -6, 4, 5, -6, 7, 3, 5, -3 };
        int n = arr.length;
        moveNegative(arr, n);
    }
}
