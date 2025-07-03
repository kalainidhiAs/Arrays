package Array;

public class sortWithotSortingAlgo {
    static int[] sort012(int nums[], int n) {
        int countzero = 0, countone = 0, counttwo = 0;
        int index = 0;

        while (index < n) {
            if (nums[index] == 0) {
                countzero++;
            }
            if (nums[index] == 1) {
                countone++;
            }
            if (nums[index] == 2) {
                counttwo++;
            }

            index++;
        }

        index = 0;
        while (index < countzero) {
            nums[index] = 0;
            index++;
        }
        while (index < countone + countzero) {
            nums[index] = 1;
            index++;
        }
        while (index < counttwo + countone + countzero) {
            nums[index] = 2;
            index++;
        }
        return nums;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 0, 1, 0, 2, 0, 1, 2, 0, 2, 2, 1, 2, 0, 1, 2, 1, 0, 0, 2 };
        int n = nums.length;
        int result[] = sort012(nums, n);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}
/*
 * //User function template for Java
 * 
 * class Solution
 * {
 * public static void sort012(int a[], int n)
 * {
 * int low=0,mid=0, high = n-1;
 * while(mid<=high){
 * if(a[mid] == 0){
 * int temp = a[mid];
 * a[mid] = a[low];
 * a[low] = temp;
 * low++;
 * mid++;
 * }
 * else if(a[mid] == 1){
 * mid++;
 * }
 * else{
 * int temp = a[mid];
 * a[mid] = a[high];
 * a[high] = temp;
 * high--;
 * }
 * }
 * }
 * }
 */