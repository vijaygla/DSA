public class LeftRotateByT {
    public static void leftRotateBy1(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void leftRotateByT(int arr[],int t){
        for(int i=0;i<t;i++){
            leftRotateBy1(arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int t=2;
        leftRotateByT(arr, t);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
