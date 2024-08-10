import java.util.Scanner;

public class LinerSearch {

    public static int linerSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find:");
        int x= sc.nextInt();
        System.out.println("Enter the size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter element in array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = linerSearch(arr, x);
        sc.close();

        System.out.println("Index of "+x+" = "+result);
    }

}


