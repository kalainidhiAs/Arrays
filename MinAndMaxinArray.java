package Array;

public class MinAndMaxinArray {
    public void minmax(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("minimum number: " + min);
        System.out.println("maximum number: " + max);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 3, 1 };
        MinAndMaxinArray newminmax = new MinAndMaxinArray();
        newminmax.minmax(arr);
    }
}
/*
 * class Compute
 * {
 * static Pair getMinMax(long a[], long n)
 * {
 * //Write your code here
 * long min = a[0];
 * long max = a[0];
 * 
 * for (int i = 0; i < n; i++) {
 * if (a[i] < min) {
 * min = a[i];
 * }
 * if (a[i] > max) {
 * max = a[i];
 * }
 * }
 * 
 * return new Pair(min, max);
 * }
 * }
 * 
 */
