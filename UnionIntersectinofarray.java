package Array;

public class UnionIntersectinofarray {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 2, 6, 8, 6 };
        int sum = 0, mul = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            mul *= arr[i];
        }
        System.out.println("Union of Array: " + sum);
        System.out.println("Intersection of Array: " + mul);
    }
}
