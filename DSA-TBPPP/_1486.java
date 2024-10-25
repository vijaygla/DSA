/**
 * 1486. XOR Operation in an Array
 */
public class _1486 {

    public static int xorOperation(int n, int start) {
        int sum = 0;
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
        }

        for (int num : nums) {
            sum += sum ^ num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5, start = 0;
        System.out.println("Output: "+xorOperation(n, start));
    }
}
