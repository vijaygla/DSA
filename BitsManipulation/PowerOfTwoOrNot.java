// // Naive Approch
// public class PowerOfTwoOrNot {
//     public static Boolean powerOfTwo(int n){
//         if(n==0) return false;
//         while(n != 1){
//             if(n%2 == 1){
//                 return false;
//             }
//             n=n/2;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int n=1024;
//         System.out.println(powerOfTwo(n));
//     }
// }



// Efficient Approch 
public class PowerOfTwoOrNot {
    public static Boolean isPow2(int n) {
        if((n & (n & (n-1))) == 0) return true;
        else return false;
    }
    public static void main(String [] args){
        int n = 2048;
        System.out.println(isPow2(n));
    }
}
