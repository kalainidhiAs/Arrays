package Array;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PhinLandCoinProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of ways: ");
        int n = in.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            int value = (int) Array.get(arr, i);
            while (value >= 1) {
                value = value / 2;
                count++;
            }
            System.out.println(count);
        }
        in.close();
    }

}