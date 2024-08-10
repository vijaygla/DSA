// // Naive Approch
// public class PrimeNumber {
//     public static Boolean isPrime(int n) {
//         if(n==1) return false;
//         for(int i=2;i<n;i++){
//             if(n%i==0) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int n=14;
//         Boolean ans = isPrime(n);
//         System.out.println(n+" is prime : "+ans);
//     }
// }




// // Efficient Approch
// public class PrimeNumber {
//     public static Boolean isPrime(int n) {
//         if(n==1) return false;
//         for(int i=2;i<=n/2;i++){
//             if(n % i ==0 ) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int n=9;
//         Boolean ans=isPrime(n);
//         System.out.println(ans);
//     }
// }




// Most Efficient Approch
public class PrimeNumber {
    public static Boolean isPrime(int n){
        if( n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i<=n/2;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 2;
       Boolean ans = isPrime(n);
       System.out.println(ans);
    }
}
