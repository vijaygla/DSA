// // Naive Approch
// public class AllDivisorNumber {
//     public static void divisorNumber(int n){
        
//         System.out.println("All Divisor Of "+n+":-");
//         for(int i=1;i<=n;i++){
//             if(n % i==0){
//                 System.err.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=12;
//         divisorNumber(n);
//     }
// }





// // Efficient Approch
// public class AllDivisorNumber {
//     public static void divisorNumber(int n){
//         System.out.println("All Divisor of "+ n + " :-");
//         for(int i=1;i*i <=n;i++){
//             if(n % i==0){
//                 System.out.println(i);
//                 // Cornor case
//                 if(i != n/i){
//                     System.err.println(n/i);
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         divisorNumber(123);
//     }
// }




// Most Efficient Way Which print the divisor in order :-
public class AllDivisorNumber {
    public static void divisorNumber(int n){
        System.out.println("All the Divisor of "+ n +" :-");
        int i;
        if(n<1) return; 
        // print exclusive
        for(i=1;i*i<n;i++){
            if(n % i==0){
                System.out.println(i);
            }
        }
        // print with inclusive 
        for ( ; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
        n=n/i;  // to not repeat more value 
    }
    public static void main(String[] args) {
        divisorNumber(12);
    }
}
