// public class RemoveDuplicate {
//     // function to remove duplicate from a sorted array 
//     public static int removeDuplicate(int arr[],int n){
//         int temp[n];
//         temp[0] = arr[0];
//         int ans =1;
//         for(int i=1;i<n;i++){
//             if(temp[ans-1] != arr[i]){
//                 temp[ans] = arr[i];
//                 ans++;
//             }
//         }
//         for(int i=0;i<ans;i++)
//             arr[i]=temp[i];
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr[]={3,5,6,8,3,5};
//         int n=6;
//         removeDuplicate(arr, n);
//     }
// }




// Efficient approch 
public class RemoveDuplicate {
    public static int removeDuplicate(int arr[],int n){
        int ans =1;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[ans-1]){
                arr[ans] = arr[i];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int arr[] = {4,5,7,4,5};
        int result = removeDuplicate(arr, n);
        System.out.print("index : "+result);
    }
}
