// // Naive Approch
// public class GreatestOfArray {
//     public static int greatestElement(int arr[]){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             Boolean flag = true; // flag is Boolean Variable which can hold either true or false
//             for(int j=0;j<n;j++){
//                 if(arr[j] > arr[i]){
//                     flag = false;
//                     break;
//                 }
//             }
//             if(flag == true){
//                 return i;
//             }
//         }
//         return -1; 
//     }
//     public static void main(String[] args) {
//         int arr[]={5,8,9,9,3};
//         int result = greatestElement(arr);
//         System.out.println("Index of Greatest element : "+result);
//     }
// }




// Efficient Approch 
public class GreatestOfArray {
    public static int greatestElement(int arr[]){
        int ans =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[ans]){
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,6,7,2,9};
        int result=greatestElement(arr);
        System.out.println("Index of greatest Element : "+result);
    }
}
