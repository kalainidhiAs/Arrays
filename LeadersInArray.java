package Array;

import java.util.*;

public class LeadersInArray {
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> newleader = new ArrayList<>();
        int Rightmax = arr[arr.length - 1];
        newleader.add(Rightmax);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= Rightmax) {
                Rightmax = arr[i];
                newleader.add(Rightmax);
            }
        }

        Collections.reverse(newleader);

        return newleader;
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        int n = arr.length;
        System.out.println("Leaders in the array are: " + leaders(arr, n));
    }
}