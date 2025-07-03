package Array;

public class MinNumberOfJump {
    public static int minJumps(int arr[]) {

        int near = 0, far = 0, jumps = 0;

        while (far < arr.length - 1) {
            int farthest = 0;
            for (int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + arr[i]);
            }

            if (farthest <= far)
                return -1;

            near = far + 1;
            far = farthest;
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 4, 3, 2, 1 };
        int result = minJumps(arr);
        if (result != -1) {
            System.out.println("Minimum number of jumps: " + result);
        } else {
            System.out.println("It's not possible to reach the end of the array.");
        }
    }
}
