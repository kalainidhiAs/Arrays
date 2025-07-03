package Array;

public class ElementInRange {
    static boolean check_elements(int arr[], int n, int A, int B) {
        boolean[] inRange = new boolean[B - A + 1];

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if (element >= A && element <= B) {
                inRange[element - A] = true;
            }
        }

        for (boolean value : inRange) {
            // System.out.print(value + " ");
            if (!value) {
                return false;
            }
        }

        // System.out.println(inRange);

        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 3, 4, 2 };
        int n = arr.length;
        int A = 2;
        int B = 4;
        System.out.println(check_elements(arr, n, A, B));
    }
}
