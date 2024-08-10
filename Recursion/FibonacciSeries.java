// // Iterative Approch
// public class FibonacciSeries {
//     public static void fib(int n){
//         int a=0,b=1;int sum=0;
//         System.err.println("Fibonacci Series :");
//         for(int i=0;i<n;i++){
//             System.out.print(a+" ");
//             sum +=a;
            
//             int next = a+b;
//             a = b;
//             b = next;
//         }
//         System.out.println();
//         System.out.println("Sum = "+sum);
//     }
//     public static void main(String[] args) {
//         int n = 5 ;
//         fib(n);
//     }
// }




// Recursive Approch 
public class FibonacciSeries {
    public static void printFibonacci(int n, int a, int b) {
        if (n > 0) {
            System.out.print(a + " ");
            printFibonacci(n - 1, b, a + b);
        }
        
    }
    public static void main(String[] args) {
        int n = 7 ;
        System.out.println("Fibonacci Series:");
        printFibonacci(n, 0, 1);
    }
}
