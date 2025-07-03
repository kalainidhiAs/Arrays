package Array;

import java.util.ArrayList;

public class RightRotationList {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n = arr.size();
        int array[] = new int[n];
        k = k % n; // Handle cases where k is greater than the size of the array
        for (int i = 0; i < n; i++) {
            int index = (k + i) % n;
            array[index] = arr.get(i);
        }

        arr.clear();
        for (int i : array) {
            arr.add(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int k = 3;
        System.out.println(rotateArray(list, k));
    }
}
