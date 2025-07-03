package Array;

public class Palindromic_Array {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (!ispal(a[i])) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean ispal(int num) {
        String str = Integer.toString(num);
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = { 121, 1331, 22, 121 };
        int[] arr2 = { 123, 456, 789 };

        System.out.println("Is arr1 palindromic? " + Palindromic_Array.palinArray(arr1, arr1.length));
        System.out.println("Is arr2 palindromic? " + Palindromic_Array.palinArray(arr2, arr2.length));
    }

}
