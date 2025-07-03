package Array;

public class ElementWithLeftSideSmallerAndRightSideGreate {
    public static void findElement(int arr[], int n) {
        int element = arr[1];
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {

            while (left <= right) {
                if (element > arr[left] && element < arr[right]) {
                    right++;
                } else {
                    left++;
                }
            }

        }
        System.out.println(element);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 5, 7, 9 };
        int n = arr.length;
        findElement(arr, n);
    }
}
