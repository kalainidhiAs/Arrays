package Array;

public class remove_dup_fromSortedarray {
    public static int remove(int nums[]) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[nums.length - 1];
        return j;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 5, 6 };
        int unique = remove(nums);
        System.out.println(unique);
    }
}
