import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int coins[], int amount) {
        int max = amount + 1;
        int dp[] = new int[max];

        dp[0] = 0;
        Arrays.fill(dp, max);

        for (int coin : coins) {
            for (int i = coin; i < amount; i++) {
                dp[i] = Math.min(dp[i], dp[i-coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5 };
        int amount = 11;

        int ans = coinChange(arr, amount);
        System.out.println(ans);
    }
}
