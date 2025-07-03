package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> duplicatesList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            System.out.println(index);

            if (arr[index] < 0) {
                duplicatesList.add(index);
            } else {
                System.out.println("index - index : " + (arr[index] = -arr[index]));
                System.out.println(Arrays.toString(arr));
                // arr[index] = -arr[index];
            }
        }

        if (duplicatesList.isEmpty()) {
            duplicatesList.add(-1);
        }

        return duplicatesList;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 1, 2, 2, 1 };
        ArrayList<Integer> result = duplicates(arr, arr.length);
        System.out.println(result);

    }
}
