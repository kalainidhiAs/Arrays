package Array;

import java.util.*;

public class arrayOfArrayProduct {

    static int[] ArrayProducts(int[] arr) {
        // your code goes here

        int n = arr.length;
        if (n == 0 || n == 1) {
            return arr;
        }

        int productarr[] = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            productarr[i] = product;
            product *= arr[i];
        }
        System.out.println(Arrays.toString(productarr));

        product = 1;
        for (int i = n - 1; i >= 0; i--) {
            productarr[i] *= product;
            product *= arr[i];
        }
        return productarr;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 10, 2 };
        int result[] = ArrayProducts(arr);
        System.out.println(Arrays.toString(result));

    }

}