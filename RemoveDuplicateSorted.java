package Array;

import java.util.*;

public class RemoveDuplicateSorted {
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
        if (arr.size() == 0) {
            return 0;
        }

        int index = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(i - 1))) {
                arr.set(index++, arr.get(i - 1));
            }

        }

        arr.set(index++, arr.get(arr.size() - 1));

        System.out.println(arr);
        return index;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
        RemoveDuplicateSorted obj = new RemoveDuplicateSorted();
        System.out.println(obj.remove_duplicate(list));
    }
}
