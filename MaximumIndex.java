package Array;

public class MaximumIndex {
    static int maxIndexDiff(int a[], int n) {

        // Your code here
        int max = 0;
        for (int i = 0; i < n; i++) {
            int j = n - 1;
            while (j != i) {
                if (a[i] <= a[j]) {
                    max = Math.max(max, j - i);
                    break;
                } else {
                    j--;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int n = 9;
        int a[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        System.out.println(maxIndexDiff(a, n));
    }
}
