// Naive Approch
public class TransposeMatrix {
    public static void transposeMatrix(int arr[][]){
        int n = arr.length;
        int temp[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                temp[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]=temp[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        System.out.println("Transpose of Matrix:-");
        transposeMatrix(arr);
        for (int row[] : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
