public class TrailingLastZeroInFactorial {
    public static int countZero(int n){
        int ans =0;
        for(int i=5;i<=n;i=i*5){
            ans = ans +n/i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result=countZero(1000);
        System.out.println("Total zero at last of factorial = "+result);
    }
}



// // naive method can be handle upto n=12
// public class TrailingLastZeroInFactorial {
//     public static int countZero(int n){
//         int fact=1;
//         for(int i=2;i<=n;i++){
//             fact =fact*i;
//         }
//         int ans=0;
//         while(fact % 10 == 0){
//             ans++;
//             fact/=10;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int result1 =countZero(5);
//         int result2 =countZero(10);
//         int result3 =countZero(12);
//         System.out.println(result1);
//         System.out.println(result2);
//         System.out.println(result3);
//     }
// }
