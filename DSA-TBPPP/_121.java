class _121 {

    public static int maxProfit(int[] prices) {
        int leftarr[] = new int[prices.length];
        int rightarr[] = new int[prices.length];
        leftarr[0] = prices[0];
        rightarr[prices.length - 1] = prices[prices.length - 1];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            leftarr[i] = Math.min(leftarr[i - 1], prices[i]);
        }

        for (int i = prices.length - 2; i >= 0; i--) {
            rightarr[i] = Math.max(rightarr[i + 1], prices[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(rightarr[i] - leftarr[i], maxProfit);
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.print("Output: "+maxProfit(prices));
    }
}
