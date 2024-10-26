// // Naive Approch
//  public class SieveOfEratosthenes {
//     // function to check prime number 
//     public static Boolean isPrime(int n){
//         if(n==1) return false;
//         if(n==2 || n==3) return true;
//         if(n%2==0 || n%3==0){
//             return false;
//         }
//         for(int i=5;i*i<n;i=i+6){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     // Function to print the prime number  
//     public static void printPrime(int n){
//         for(int i=2;i<n;i++){
//             if(isPrime(i)){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=10;
//         printPrime(n);
//     }
// }




// // Effecient Approch 
// import java.util.Arrays;
// public class SieveOfEratosthenes {
//     // Function to print the prime number up to given number 
//     public static void printPrime(int n){
//         Boolean[] prime = new Boolean[n+1];
//         Arrays.fill(prime,true);
//         for(int i=2;i*i<=n;i++){
//             if(prime[i]){
//                 for(int j=2*i;j<=n;j=j+i){
//                     prime[j] = false;
//                 }
//             }
//         }
//         for(int i=2;i<n;i++){
//             if(prime[i]){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=10;
//         printPrime(n);
//     }
// }




// Most Efficient Approch
import java.util.Arrays;
public class SieveOfEratosthenes {
    // Function to print the prime number up to given number
    public static void printPrime(int n){
        Boolean[] prime = new Boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                System.out.println(i);
            }
            for(int j=2*i;j<=n;j=j+i){
                prime[j] = false;
            }
        }
    }
    public static void main(String[] args) {
        int n=10;
        printPrime(n);
    }
}
