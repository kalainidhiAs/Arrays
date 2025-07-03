package Array;

public class sum_of_diagnol {
    public static int diagnol(int array[][]) {
        int sum = 0;
        int numofrows = array.length;
        for (int i = 0; i < numofrows; i++) {
            sum += array[i][i];
            // System.out.println(array[i][i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arr = sum_of_diagnol.diagnol(array);
        System.out.println(arr);
    }
}
