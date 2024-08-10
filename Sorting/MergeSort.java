public class MergeSort {
    
    public static void divide(int arr[],int s,int e){
        if(s==e){
            return;
        }
        int mid = s + (e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    public static void merge(int arr[],int s,int mid,int e){
        int newarr[] = new int [e-s+1];
        int l_a=s;
        int r_a=mid+1;
        int index=0;
        while(l_a < mid && r_a <= e){
            if(arr[l_a] <= arr[r_a]){
            l_a++;
            index++;
            }
            else{
                newarr[index] = arr[r_a];
                r_a++;
                index++;
            }
        }
        while(l_a <= mid){
            newarr[index] = arr[l_a];
            l_a++;
            index++;
        }
        while(r_a <= e){
            newarr[index] = arr[l_a];
            r_a++;
            index++;
        }
        int count = s;
        for(int i=0;i<newarr.length;i++){
            arr[count] = newarr[i];
            count++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {11,9,2,4,3};
        int s=0;
        int e=arr.length-1;
        divide(arr, s, e);
        System.out.println("Sorted array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}


