import java.util.*;

public class ArraysSort {
    public static void main(String[] args) {
        int arr1[] = {2,3,5,1,9};
        char arr2[] = {'A','j','B'};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int arr3[] = {50,20,90,70,50,60};
        Arrays.sort(arr3,2,5);
        System.out.println(Arrays.toString(arr3));
    }
}



