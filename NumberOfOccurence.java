package Array;

public class NumberOfOccurence {
    static int count(int[] arr, int n) {
        // code here
        int maxcount = 0;
        int currentcount = 0;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                currentcount++;
                maxcount = Math.max(maxcount, currentcount);
            } else {
                max = arr[i];
                currentcount = 1;
            }
        }

        return maxcount;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3 };
        int n = arr.length;
        System.out.println(count(arr, n));
    }
}
