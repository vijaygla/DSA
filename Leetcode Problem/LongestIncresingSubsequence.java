import java.util.*;

public class LongestIncresingSubsequence {

    public static void longestIncresingSubsequence(int arr[]) {
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        int count = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            count = Math.max(count, dp[i]);
        }
        System.out.println("Output: "+count);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
        longestIncresingSubsequence(arr);
    }
}


