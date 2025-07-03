package Array;

public class FindMaxProductOfSubArray {
    public static int maxsub(int arr[]) {
        int maxProductEnd = arr[0];
        int minProductEnd = arr[0];
        int maxProduct = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = maxProductEnd;
                maxProductEnd = minProductEnd;
                minProductEnd = temp;
            }

            maxProductEnd = Math.max(arr[i], maxProductEnd * arr[i]);
            minProductEnd = Math.min(arr[i], minProductEnd * arr[i]);
            // System.out.println(" max " + maxProductEnd);
            // System.out.println(" min " + minProductEnd);

            maxProduct = Math.max(maxProduct, maxProductEnd);
            // System.out.println("final : " + maxProduct);
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int arr[] = { 6, -3, -10, 0, 2 };
        System.out.println(maxsub(arr));
    }
}

/*
 * 
 * class Solution {
 * // Function to find maximum product subarray
 * long maxProduct(int[] arr, int n) {
 * long max = arr[0];
 * 
 * for(int i=0;i<arr.length;i++){
 * long product = 1;
 * for(int j=i;j<arr.length;j++){
 * product *= arr[j];
 * if(product > max){
 * max = product;
 * }
 * }
 * }
 * return max;
 * }
 * }
 */