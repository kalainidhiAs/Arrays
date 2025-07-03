package Array;

public class MinimumUniqueSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 7, 7, 8 };
        int sum = arr[0], prev = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // If violation happens, make current
            // value as 1 plus previous value and
            // add to sum.
            if (arr[i] <= prev) {
                prev = prev + 1;
                sum = sum + prev;
            }

            // No violation.

            else {
                sum = sum + arr[i];
                prev = arr[i];
            }
        }

        System.out.println(sum);
    }
}
