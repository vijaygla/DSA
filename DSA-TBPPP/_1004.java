public class _1004 {

    public static int longestOnes(int[] nums, int k) {
        int ans = 0;
        int count = 0;
        int i = 0;
        int j = -1;
        
        while (i < nums.length) {
            // Aquire
            if (nums[i] == 1) {
                i++;
            } else {
                i++;
                count++;
            }

            // Release if valid
            while (count > k && j < i) {
                j++;
                if (nums[j] == 0) {
                    count--;
                }
            }

            // Consider
            ans = Math.max(ans, i - j - 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println("Output:" + longestOnes(arr, k));
    }
}
