// public class Test {
//     public static void main(String[] args) {
//         int arr[][]={{1,2,3,4,5},{6,7,8}};
//         for(int i =0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//         }
//     }    
// }





// User defined declaration of 2-d array
public class Test{
    public static void main(String[] args) {
        int m=3;
        int arr[][]= new int [m][];
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1];
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = i;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// output--such types of output array called Jagged array in which all row have different number of element. 
// 0
// 1 1
// 2 2 2
