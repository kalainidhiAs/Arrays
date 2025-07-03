package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionTWO {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> set1 = new ArrayList<>();

        for (int i : nums1) {
            set1.add(i);
        }

        ArrayList<Integer> set2 = new ArrayList<>();

        for (int j : nums2) {
            if (set1.contains(j)) {
                set2.add(j);
                set1.remove(j);
            }
        }

        int result[] = new int[set2.size()];
        int index = 0;
        for (int nums : set2) {
            result[index] = nums;
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 4, 9, 5 };
        int b[] = { 9, 4, 9, 8, 4 };
        int result[] = intersect(a, b);
        System.out.println(Arrays.toString(result));
    }
}
