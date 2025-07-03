package Array;

public class SumOfUpperAndLowerTriangle {
    public static void sumofTriangle(int matrix[][]) {
        int n = matrix.length;

        int SumUpper = 0;
        int SumLower = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                SumUpper += matrix[i][j];
                // System.out.print(matrix[i][j]);
            }
            // System.out.println();

            for (int j = 0; j <= i; j++) {
                SumLower += matrix[i][j];
            }
        }
        System.out.println(SumUpper);
        System.out.println(SumLower);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 6, 5, 4 },
                { 1, 2, 5 },
                { 7, 9, 7 } };

        sumofTriangle(matrix);
    }
}
