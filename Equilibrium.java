package Array;

public class Equilibrium {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 2 };

        int totalsum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        System.out.println("totalSum " + totalsum);

        int leftsum = 0;
        int rightsum = totalsum;

        for (int i = 0; i < arr.length; i++) {
            rightsum -= arr[i];

            if (rightsum == leftsum) {
                System.out.println("Equilibrium Index: " + i);
            }

            leftsum += arr[i];
        }
    }
}
