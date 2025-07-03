package Array;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static boolean iszero(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0 || arr[i] == 0 || set.contains(sum)) {
                return true;
            }

            set.add(sum);

        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, -3, 1, 7 };
        boolean result = iszero(arr);
        System.out.println(result);
    }
}