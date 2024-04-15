import java.util.*;

public class TreeProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int H = scanner.nextInt();
            if (H == 0) break;
            int[] values = new int[(1 << H) - 1];
            for (int i = 0; i < (1 << H) - 1; i++) {
                values[i] = scanner.nextInt();
            }
            long result = calculateP1(values, H);
            System.out.println(result);
        }
        scanner.close();
    }
    
    public static long calculateP1(int[] values, int H) {
        long[] maxValues = new long[values.length];
        for (int i = values.length - 1; i >= 0; i--) {
            if (2 * i + 1 >= values.length) {
                maxValues[i] = values[i];
            } else {
                maxValues[i] = Math.max(values[i] * maxValues[2 * i + 1], values[i] * maxValues[2 * i + 2]);
            }
        }
        return maxValues[0] % 1_000_000_007;
    }
}


