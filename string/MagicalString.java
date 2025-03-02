import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int magicalString(int n) {
        if (n == 0)
            return 0;
        if (n <= 3)
            return 1;

        List<Integer> magicalString = new ArrayList<>(Arrays.asList(1, 2, 2));
        int count = 1;
        int index = 2;

        while (magicalString.size() < n) {
            int nextNum = 3 - magicalString.get(magicalString.size() - 1);
            int groupSize = magicalString.get(index);

            for (int i = 0; i < groupSize; i++) {
                magicalString.add(nextNum);
                if (nextNum == 1 && magicalString.size() <= n) {
                    count++;
                }
            }
            index++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 10; // Example input
        int result = solution.magicalString(n);
        System.out.println("The number of '1's in the first " + n + " numbers of the magical string is: " + result);
    }

}

// input: 10
// output: 5
// explanation: The first 10 elements of the magical string is [1, 2, 2, 1, 1,
// 2, 1, 2, 2, 1]. The number of '1's in the first 10 numbers of the magical
// string is 5. So, the output is 5.

