package Array;

public class secondSmallest {
    public static int secondsmall(int arr[]) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }

        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 3 };
        System.out.println(secondsmall(arr));

    }
}
