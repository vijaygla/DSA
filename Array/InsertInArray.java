public class InsertInArray {
    public static int insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap) {
            System.out.println("Overflow");
            return n;
        }
        int index = pos - 1;
        for (int i = n - 1; i >= index; --i) {
            arr[i + 1] = arr[i];
        }
        arr[index] = x;
        return (n + 1);
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 10, 20};
        int n = 4; // Initial size of array
        int x = 3; // Element to insert
        int cap = arr.length; // Capacity of the array
        int pos = 2; // Position where to insert

        // Updating the size of array after insertion
        n = insert(arr, n, x, cap, pos);

        // Displaying the modified array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

// Since this is the Normal array not a dynamic array so we cannot insert any element in this Array 
// but by Assumtion we let that we can insert if their is any vacent space in the array.
