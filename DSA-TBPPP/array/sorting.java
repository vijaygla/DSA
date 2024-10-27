package array;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] nums = { 1, 45, 633, 2, 5, 8 };
        System.out.print("Original Array: ");
        for (int arr : nums) {
            System.out.print(arr+"  ");
        }
        System.out.println();
        Arrays.sort(nums);
        System.out.print("Sorted Array: ");
        for (int num : nums) {
            System.out.print(num+"  ");
        }
    }
}




