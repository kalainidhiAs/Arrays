package Array;

public class TotalCount {
    static int totalCount(int[] arr, int n, int k) {
        // code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += findRem(arr[i], k);
        }
        return sum;
    }

    static int findRem(int num, int k) {

        int Quo = num / k;
        int rem = num % k;
        if (rem != 0) {
            Quo++;
        }
        return Quo;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 8, 13 };
        int k = 3, n = arr.length;
        System.out.println(totalCount(arr, n, k));
    }
}
