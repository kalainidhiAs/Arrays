package Array;

public class waterTrapping {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int total = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            total = Math.max(total, (right - left) * Math.min(height[left], height[right]));
            // System.out.println(total);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(total);
    }
}
