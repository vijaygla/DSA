public class RemoveElement {

    public static int removeElement(int arr[], int val) {
        int result = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 2, 3 };
        int val = 3;
        int result = removeElement(arr, val);
        for(int i=0; i<result; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

