// // Naive Approch
// public class PrimeFactor {
//     public static Boolean isPrime(int n){
//         if(n==1) return false;
//         if(n==2 || n==3) return true;
//         if(n%2==0 || n%3==0) return false;
//         for(int i=5;i*i<=n;i=i+6){
//             if(n%i==0 || n%(i+2)==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void primeFactor(int n){
//         int i;
//         for(i=2;i<=n;i++){
//             if(isPrime(i)){
//                 int x=i;
//                 while(n % x == 0){
//                     System.err.println(i);
//                     n = n / i;
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=22;
//         primeFactor(n);
//     }
// }




// // Efficient Approch 
// public class PrimeFactor {
//     public static Boolean isPrime(int n){
//         if(n==1) return false;
//         if(n==2 || n==3) return true;
//         if(n%2==0 || n%3==0) return false;
//         for(int i=5;i*i<=n;i=i+6){
//             if(n%i==0 || n%(i+2)==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void primeFactor(int n){
//         if(n<=1) return;
//         for(int i=2;i*i<=n;i++){
//             if(isPrime(i)){
//                 while(n%i==0){
//                     System.out.println(i);
//                     n=n/i;
//                 }
//             }
//         }
//         // Corner Case 
//         if(n>1)
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n=11;
//         primeFactor(n);
//     }
// }




// Most Efficent Approch 
public class PrimeFactor {
    public static Boolean isPrime(int n){
        if(n==1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void primeFactor(int n){
        if(n<=1) return;
        while (n%2==0) {
            System.out.println(2);
            n=n/2;
        }
        while (n%3==0) {
            System.out.println(3);
            n=n/3;
        }
        int i;
        for(i=5;i*i<=n;i=i+6){
            if(isPrime(i)){
                while(n%i==0){
                    System.out.println(i);
                    n=n/i;
                }
                while(n%(i+2)==0){
                    System.out.println(i+2);
                    n=n/(i+2);
                }
            }
        }
        if(i>3)
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=315;
        primeFactor(n);
    }
}
