// public class Test {
//     public static void fun(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         fun(n-1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         fun(n);
//     }
// }
// OutPut
// 3
// 2
// 1
// 1
// 2
// 3





// Ecxample 2
// public class Test {
//     public static void fun(int n){
//         if(n==0){
//             return;
//         }
//         fun(n-1);
//         System.out.println(n);
//         fun(n-1);
//     }
//     public static void main(String[] args) {
//         int n =3;
//         fun(n);
//     }
// }
// output
// 1
// 2
// 1
// 3
// 1
// 2
// 1



// other Example code in Recursion 
// public class Test {
//     public static void fun(int n) {
//         if(n==0) {
//             return ;
//         }
//         fun(n/2);
//         System.out.println((n%2));
//     }
//     public static void main(String[] args) {
//         int n = 13 ;
//         fun(n);
//     }
// }
// output 
// 1
// 1
// 0
// 1



// // this function find the logn base 2
// public class Test {
//     public static int fun(int n ){
//         if(n==1){
//             return 0;
//         }
//         else{
//             return 1+fun(n/2);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 16 ;
//         System.out.println("Result = "+fun(n));
//     }
// }

// Output 
// 4




