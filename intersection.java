package Array;

import java.util.HashSet;

public class intersection {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {

        HashSet<Integer> intersection = new HashSet<>();

        for (int i = 0; i < n; i++) {
            intersection.add(a[i]);
        }

        int count = 0;

        for (int j = 0; j < m; j++) {
            if (intersection.contains(b[j])) {
                count++;
                intersection.remove(b[j]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 6 };
        int b[] = { 1, 2, 5, 6 };

        int n = a.length;
        int m = b.length;
        System.out.println("Number of Elements In Intersection : " + NumberofElementsInIntersection(a, b, n, m));
    }
};