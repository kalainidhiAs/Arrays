package Array;

import java.util.Scanner;

public class snake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = in.nextInt();
        System.out.print("Enter the no of coloumn: ");
        int col = in.nextInt();
        int arr[][] = new int[row][col];
        int count = 0;

        for (int i = 0; i < row; i++) {
            if (i % 2 != 1) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = count++;
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    arr[i][j] = count++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}