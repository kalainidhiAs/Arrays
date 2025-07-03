package Array;

import java.util.Arrays;

public class ModifyAndRearange {
    static void modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] == arr[i + 1]) && arr[i] != 0) {
                arr[i] = arr[i] * 2;
                arr[i + 1] = 0;
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 0, 4, 0, 8 };
        modifyAndRearrangeArr(arr);
    }
}
