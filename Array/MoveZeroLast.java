// // Naive Approch
// public class MoveZeroLast {
//     public static void moveZeroLast(int arr[]) {
//         int n = arr.length;
//         int count = 0; // Count of non-zero elements
//         // Traverse the array. If element encountered is non-zero, then
//         // replace the element at index 'count' with this element
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != 0) {
//                 arr[count++] = arr[i]; // here count is incremented
//             }
//         }
//         // Now all non-zero elements have been shifted to front, so add zeros
//         while (count < n) {
//             arr[count++] = 0;
//         }   
//     }
//     public static void main(String[] args) {
//         int arr[] = {2, 0, 9, 0, 3};
//         moveZeroLast(arr);
//         // Print the modified array
//         for (int k = 0; k < arr.length; k++) {
//             System.out.print(arr[k] + " ");
//         }
//     }



// Efficient Approch 
public class MoveZeroLast {
    // Function to swap element of array
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // function to move all zero elemnt in last
    public static void moveZeroLast(int arr[]) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 9, 0, 4};
        moveZeroLast(arr);
        // Printing the modified array
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
