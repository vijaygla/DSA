public class SearchingInArray {
    public static int search (int n, int x,int arr[]) {
        for(int i=0;i<n;i++){
            if(arr[i] == x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Index : "+search(5,5,arr));
    }
}

