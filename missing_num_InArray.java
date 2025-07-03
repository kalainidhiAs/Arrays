package Array;

//(n*(n+1))/2
public class missing_num_InArray {
    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length + 1;
        int expected_sum = (n * (n + 1)) / 2;
        int actual_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            actual_sum += arr[i];
        }
        return expected_sum - actual_sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6 };
        int array = missing_num_InArray.findMissingNumberInArray(arr);
        System.out.println(array);
    }

}
