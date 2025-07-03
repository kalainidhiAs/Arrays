package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElementsInArray {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                result.add(A[i]);
                i++;
                j++;
                k++;
            } else if (A[i] < B[j] || A[i] < C[k]) {
                i++;
            } else if (B[j] < A[i] || B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        HashSet<Integer> unique = new HashSet<>(result);
        ArrayList<Integer> newUnique = new ArrayList<>(unique);
        newUnique.sort(null);

        return newUnique;
    }

    public static void main(String[] args) {
        int[] A = { 1, 5, 10, 20, 40, 80, 100 };
        int[] B = { 6, 7, 20, 80, 100 };
        int[] C = { 3, 4, 15, 20, 30, 70, 80, 100, 120 };

        CommonElementsInArray solution = new CommonElementsInArray();
        ArrayList<Integer> commonElements = solution.commonElements(A, B, C, A.length, B.length, C.length);

        System.out.println("Common Elements: " + commonElements);
    }
}
