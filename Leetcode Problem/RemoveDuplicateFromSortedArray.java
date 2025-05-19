public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicateFromSortedArray(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count]) {
                count++;
                arr[count] = arr[i];
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int uniqueLength = removeDuplicateFromSortedArray(arr);

        for(int i=0; i<uniqueLength; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}


