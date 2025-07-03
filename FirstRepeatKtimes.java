package Array;

import java.util.HashMap;

public class FirstRepeatKtimes {
    public static int firstRepeatedelement(int arr[], int n, int k) {
        HashMap<Integer, Integer> countNum = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int currentElement = arr[i];
            countNum.put(currentElement, countNum.getOrDefault(currentElement, 0) + 1);
            // System.out.println(countNum);

            if (countNum.get(currentElement) == k) {
                return currentElement;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 4, 3, 4, 8, 7 };
        int n = arr.length;
        int k = 2;
        System.out.println(firstRepeatedelement(arr, n, k));
    }
}
