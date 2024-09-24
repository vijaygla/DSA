import java.util.*;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int n = arr.length;
        int max = Arrays.stream(arr).max().orElse(0);

        // Create a count array to store the count of each distinct element
        int[] count = new int[max + 1];

        // Store the count of each element
        for (int i = 0; i < n; ++i) {
            count[arr[i]]++;
        }

        // Modify the count array to get the actual position of each element
        for (int i = 1; i <= max; ++i) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copying the output array to the input array
        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
