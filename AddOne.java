package Array;

import java.util.Arrays;

public class AddOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] res = new int[n + 1];
        res[0] = 1;

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        int res[] = plusOne(arr);
        System.out.println(Arrays.toString(res));

        int arr1[] = { 9, 9, 9 };
        res = plusOne(arr1);
        System.out.println(Arrays.toString(res));
    }
}
