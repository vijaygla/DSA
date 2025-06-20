// using tabulation in dp

public class FibSeries3 {

    public static void main(String[] args) {
        int n = 10;
        int dp[] = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<n; i++){ 
            dp[i] = dp[i-1] + dp[i-2];
        }
        for(int a : dp) {
            System.out.print(a+ "  ");
        }
    }
}

