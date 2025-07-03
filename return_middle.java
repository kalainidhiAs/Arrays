package Array;

import java.util.Arrays;

public class return_middle {
    public static int[] middle(int[] array) {
        int j = 0;
        int newarr[] = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            newarr[j] = array[i];
            j++;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6 };
        int arr[] = return_middle.middle(array);
        System.out.println(Arrays.toString(arr));
    }
}
