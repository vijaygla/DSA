public class InsertInDynamicArray{
    public static int delete(int arr[],int n,int x){
        int i;
        for(i=0;i<n;i++)
            if(arr[i] == x)
                break;
        if(i==n)
            return n;
        for(int j=i;j<n-1;j++)
            arr[j] = arr[j+1];
        return (n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={3,8,12,5,6};
        int x = 12;
        delete(arr, n, x);
        System.out.println("Array After Deletion of Element:");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+",");
        }
    }
}


// notes:
// after deletion of element from array array size will be same 
