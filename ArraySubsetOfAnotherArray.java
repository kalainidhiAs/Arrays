package Array;

import java.util.ArrayList;

public class ArraySubsetOfAnotherArray {

    public static String issubset(long a1[], long a2[]) {
        ArrayList<Long> set = new ArrayList<>();

        for (int i = 0; i < a1.length; i++) {
            set.add(a1[i]);
        }

        for (int j = 0; j < a2.length; j++) {
            if (!set.contains(a2[j])) {
                return "No";
            }
            set.remove(a2[j]);
        }
        return "Yes";
    }

    public static void main(String[] args) {
        long[] a1 = { 2, 4, 3, 1, 7, 5, 15 };
        long[] a2 = { 1, 3, 4, 5, 2 };

        System.out.println(issubset(a1, a2));
    }
}

/*
 * for(int i : a1){
 * set.add(i);
 * }
 * 
 * for(int j : a2){
 * if(!set.contains(j));
 * return "no";
 * }
 */
