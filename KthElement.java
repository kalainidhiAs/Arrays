package Array;

public class KthElement {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int i = 0, j = 0, count = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                count++;
                if (count == k) {
                    return arr1[i];
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2[j];
                }
                j++;
            }
        }

        while (i < arr1.length) {
            count++;
            if (count == k) {
                return arr1[i];
            }
            i++;
        }

        while (j < arr2.length) {
            count++;
            if (count == k) {
                return arr2[j];
            }
            j++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int k = 5, arr1[] = { 2, 3, 6, 7, 9 }, arr2[] = { 1, 4, 8, 10 };
        System.out.println(new KthElement().kthElement(k, arr1, arr2));

    }
}
