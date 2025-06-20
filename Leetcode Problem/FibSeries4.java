// using memoisation in dp

import java.util.Arrays;

public class FibSeries4 {

    public static int printFib(int n, int dp[]) {
        if(n < 1) {
            return dp[n];
        }
        return dp[n-1] + dp[n-2];
    }

    public static void main(String[] args) {
        int n = 10;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        printFib(n, dp);
        
    }
}
