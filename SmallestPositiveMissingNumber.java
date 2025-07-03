package Array;

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size) {
        // Your code here
        int max = 1000010;
        int maxelement = Integer.MIN_VALUE;

        boolean present[] = new boolean[max];

        for (int i = 0; i < size; i++) {
            if (arr[i] > 0 && arr[i] <= size) {
                present[arr[i]] = true;

                maxelement = Math.max(maxelement, arr[i]);
            }
        }

        for (int i = 1; i < max; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return maxelement + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, -1, 5 };
        System.out.println("Smallest positive missing number is " + missingNumber(arr, arr.length));
    }
}
