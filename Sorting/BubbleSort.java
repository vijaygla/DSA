public class BubbleSort {

    // Naive Solution
    public static void bubbleSort(int arr[]){
        int n = arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }

    // Efficient Solution 
    public static void bubbleSort2(int arr[]){
        boolean swapped;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            swapped = false;
            for(int j = 0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // ya to pahle se sorted h nahi to sorted ho chukka h 
            if(swapped == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,8,9,4,0,5};

        // bubbleSort(arr);

        bubbleSort2(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}


