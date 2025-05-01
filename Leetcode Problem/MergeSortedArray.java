import java.util.Arrays;

public class MergeSortedArray {

    public static void mergeSortedArray(int nums1[], int nums2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // copy remaining element from the nums2
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 0, 0, 0, 0};
        int m = 4;
        int[] nums2 = {5, 2, 5, 8};
        int n = nums2.length;
        Arrays.sort(nums2);
        mergeSortedArray(nums1, nums2, m, n);
        // System.out.println(Arrays.toString(nums1));
        for(int a : nums1) {
            System.out.print(a + "  ");
        }
    }
}


