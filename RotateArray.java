package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93, 53, 57, 2, 81, 87, 42, 66,
                90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10, 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33,
                30, 4, 20, 71, 69, 9, 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1, 35, 65,
                25
        };

        int k = 69;

        int newarr[] = new int[arr.length];
        int j = 0;
        for (int i = k; i < arr.length; i++) {
            if (j < arr.length) {
                newarr[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < k; i++) {
            newarr[j] = arr[i];
            j++;
        }

        System.out.println(Arrays.toString(newarr));
    }
}

/*
 * class Solution {
 * public void rotate(int[] nums, int k) {
 * int n = nums.length;
 * int rotatearr[] = new int[n];
 * 
 * for(int i=0; i<n; i++){
 * int rotateIndex = (i+k)%n;
 * rotatearr[rotateIndex] = nums[i];
 * }
 * 
 * System.arraycopy(rotatearr, 0, nums, 0, n);
 * }
 * }
 */

/*
 * static void rotateArr(int arr[], int d, int n)
 * {
 * // add your code here
 * 
 * d = d % n;
 * int i, j, k, temp;
 * int g_c_d = gcd(d, n);
 * for (i = 0; i < g_c_d; i++) {
 * 
 * temp = arr[i];
 * j = i;
 * while (true) {
 * k = j + d;
 * if (k >= n)
 * k = k - n;
 * if (k == i)
 * break;
 * arr[j] = arr[k];
 * j = k;
 * }
 * arr[j] = temp;
 * }
 * }
 * 
 * static int gcd(int a, int b)
 * {
 * if (b == 0)
 * return a;
 * else
 * return gcd(b, a % b);
 * }
 */