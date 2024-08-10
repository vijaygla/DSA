public class BinarySearch {
    // Iterative Method----------------
    public static int binarySearch(int arr[],int x){
        int low=0,high=arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Recursive Method----------------
    public static int bSearch(int arr[],int low,int high,int x){
        if(low > high) return -1;
        int mid = (low+high)/2;
        if(arr[mid] == x) return mid;
        else if(arr[mid] > x) return bSearch(arr, low, mid-1, x);
        else return bSearch(arr, mid+1, high, x);
    }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 6;
        int result=binarySearch(arr, x);
        System.out.println("Index of x iterative :"+result);


        int ans = bSearch(arr, 0, arr.length-1, x);
        System.out.println("Index of x by recursive:"+ans);
    }

}



