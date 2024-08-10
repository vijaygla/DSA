// // Naive Approch 
// public class SecondLargest {
//     public static int getLargest(int arr[]){
//         int largest =0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] > arr[largest]){
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static int secondLargest(int arr[]){
//         int large = getLargest(arr);
//         int ans =-1;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i] != arr[large]){
//                 if(ans == -1)
//                     ans = i;
//                 else if(arr[i] > arr[ans]) 
//                     ans = i; 
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr[]={5,20,12,20,10};
//         int result=secondLargest(arr); 
//         System.out.println("Second largest Number Index : "+result);  
//     }
// }




// Efficient Approch 
public class SecondLargest{
    public static int secondLargest(int arr[]){
        int n=arr.length;
        int res= -1 , largest =0;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if(res == -1 || arr[i] > arr[res])
                    res = i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,20,12,20,8};
        int result=secondLargest(arr);
        System.out.println("Index of Second largest : "+result);
    }
}
