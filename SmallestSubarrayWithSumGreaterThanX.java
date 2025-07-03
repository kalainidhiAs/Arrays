package Array;

public class SmallestSubarrayWithSumGreaterThanX {
    public static int subarr(int arr[], int x) {
        int cur_sum = 0;
        int min_length = arr.length + 1;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            cur_sum += arr[i];

            while (cur_sum > x && start <= i) {
                min_length = Math.min(min_length, i - start + 1);
                cur_sum -= arr[start];
                start++;
            }
        }

        return (min_length == arr.length + 1) ? 0 : min_length;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 45, 6, 0, 19 };
        int x = 51;
        int result = subarr(arr, x);
        System.out.println(result);
    }
}
