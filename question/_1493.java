public class _1493 {

    public static int longestSubarray(int[] nums) {
        int head = 0, tail = 0, maxLen = 0, count = 0;

        for (head = 0; head < nums.length; head++){
            if (nums[head] == 0) {
                count++;
            }

            while (count > 1) {
                if (nums[tail] == 0)
                    count--;
                tail++;
            }
            maxLen = Math.max(maxLen, head - tail);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(longestSubarray(nums));
    }
}
