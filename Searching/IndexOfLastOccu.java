public class IndexOfLastOccu {
    // Naive Approach----------------
    public static int indexOfLastOccu(int arr[], int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Efficient Approach(Recursive)-------------
    public static int indexOfLastOccuRecur(int arr[], int low, int high, int x) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (x < arr[mid])
            return indexOfLastOccuRecur(arr, low, mid - 1, x);
        else if (x > arr[mid])
            return indexOfLastOccuRecur(arr, mid + 1, high, x);
        else {
            if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                return mid;
            } else {
                return indexOfLastOccuRecur(arr, mid + 1, high, x);
            }
        }
    }

    // Most Efficient Approach(Iterative)--------------
    public static int indexOfLastOccuIterative(int arr[], int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x < arr[mid]) {
                high = mid - 1;
            } else if (x > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid] != arr[mid + 1])
                    return mid;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5};
        int x = 4;

        System.out.println("Index By Naive Approach:");
        int result = indexOfLastOccu(arr, x);
        System.out.println(result);

        System.out.println("Index by Efficient Approach:");
        int result2 = indexOfLastOccuRecur(arr, 0, arr.length - 1, x);
        System.out.println(result2);

        System.out.println("Index by Most Efficient Approach:");
        int result3 = indexOfLastOccuIterative(arr, x);
        System.out.println(result3);
    }
}