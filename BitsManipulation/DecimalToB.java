public class DecimalToB {
    public static void decimalToBinary(int n,int i){
        int arr [] = new int[32];
        System.out.print("Binary of number : ");
        if(n==0){
            System.out.println(0);
        }
        while(n > 0) {
            arr[i++] = n % 2;
            n /= 2;
        }
        for(int j = i-1;j >= 0;j--){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        int n = 128 ;
        int i=0;
        decimalToBinary(n, i);
    }
}
