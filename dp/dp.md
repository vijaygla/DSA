# Key Differences 
`Exaple of Fibonacci series in using both method`
1. **Memoization**: Top-down approach using recursion and storing results of subproblems to avoid redundant calculations.
```
class Solution {
    public int fib(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return fibHelper(n, memo);
    }

    private int fibHelper(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        memo[n] = fibHelper(n - 1) + fibHelper(n - 2);
        return memo[n];
    }
}

```

2. **Tabulation**: Bottom-up approach using iteration and solving subproblems in a sequence.
```
class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

```
3. 
