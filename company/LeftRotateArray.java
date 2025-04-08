public class LeftRotateArray {

    public static void reverse(int arr[], int i, int j) {
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void rotateArray(int arr[], int k, int n) {
        k = k % n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int n = arr.length;

        rotateArray(arr, k, n);

        for(int a : arr) {
            System.out.print(a+" ");
        }
    }
}


