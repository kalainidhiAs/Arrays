package Array;

import java.util.HashSet;

public class Union {
    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 9 };
        int n = a.length;
        int m = b.length;

        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < n; i++) {
            union.add(a[i]);
        }

        for (int j = 0; j < m; j++) {
            union.add(b[j]);
        }

        System.out.println(union.size());
    }
}
