public class MaximumSumSubArraySum {
    // Function to find the maximum sum of a subarray of size k
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;

        // Edge case: if k is greater than the array length, it's not possible to form a
        // subarray
        if (n < k) {
            System.out.println("Invalid input: k is larger than array size.");
            return -1;
        }

        // Calculate the sum of the first 'k' elements (first window)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Initialize maxSum with the sum of the first window
        int maxSum = windowSum;

        // Now slide the window one element at a time from left to right
        for (int i = k; i < n; i++) {
            // Subtract the element that is sliding out of the window
            // and add the element that is sliding into the window
            windowSum += arr[i] - arr[i - k];

            // Update maxSum if the new window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        // Return the maximum sum found
        return maxSum;
    }

    public static void main(String[] args) {
        // Example input array
        int[] arr = { 2, 1, 5, 1, 3, 2 };

        // Size of the subarray window
        int k = 3;

        // Call the function and store the result
        int result = maxSum(arr, k);

        // Output the result
        System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
    }
}


