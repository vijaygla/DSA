// // Naive Approch
// public class ArraySortedOrNot {
//     public static boolean isSorted(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j] < arr[i])
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int arr[] = {8,19,15};
//         Boolean result = isSorted(arr);
//         System.out.println(result);
//     }
// }



// Efficient Approch 
public class ArraySortedOrNot{
    public static Boolean isSorted(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {4,6,7,8,2};
        Boolean result = isSorted(arr);
        System.out.println(result);
    }
}
