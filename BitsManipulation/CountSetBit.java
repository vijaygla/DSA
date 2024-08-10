// // Naive  Approch
// public class CountSetBit {
//     public static int countSetBit(int n){
//         int count = 0;
//         while(n>0) {
//             // if(n % 2==1){
//             //     count++;
//             // }
//             count = count + (n & 1);
//             n=n/2;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         System.out.println("Result = "+countSetBit(5));
//     }
// }




// Efficient Approch 
public class CountSetBit {
    public static int countSetBit(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);
            count=count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=5;
        int result = countSetBit(n);
        System.out.println(result);
    }
}
