public class IndexOfFirstOccu {
    // Naive Approch-------------------------
    public static int firstOccurance(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    // Efficient Approch(Recursive)-------------
    public static int firstOccuRecur(int arr[],int low,int high,int x){
        if(low > high) return -1;
        int mid = (low+high)/2;
        if(x > arr[mid]) return firstOccuRecur(arr, mid+1, high, x);
        else if (x < arr[mid]) return firstOccuRecur(arr, low, mid-1, x);
        else {
            if(mid==0 || arr[mid-1] != arr[mid]){
                return mid;
            }
            else{
                return mid -1;
            }
        }
    }

    // Most Efficient Approch(Iterative)--------------
    public static int firstOccurIter(int arr[],int x){
        int low =0;int high = arr.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if(x < arr[mid]) {
                high = mid -1 ;
            }
            else if (x > arr[mid]) {
                low = mid +1;
            }
            else {
                if(mid == 0 || arr[mid-1] != arr[mid]) 
                    return mid;
                else 
                    return mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int x = 3;
        System.out.println("Index by Naive Approch:");
        int result = firstOccurance(arr, x);
        System.err.println(result);

        System.out.println("Index by Efficient Approch:");
        int result2 = firstOccuRecur(arr, 0, arr.length, x);
        System.out.println(result2);

        System.out.println("Index by Most Efficient Approch:");
        int result3 = firstOccurIter(arr, x);
        System.out.println(result3);
    }
}


