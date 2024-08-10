public class ReverseArray {
    public static void reverseArray(int arr[],int n){
        // n:number of size ,start:starter index ,end:ender index
        int start=0;int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reverse Array : ");
        for(int i=0;i<n;i++){
            System.err.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={12,34,56};int n=3;
        System.out.print("Orignal Array : ");
        for(int i=0;i<n;i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
        reverseArray(arr,n);
    }
}
