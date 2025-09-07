public class FibonacciNumber {

    public static int f(int n) {
        if(n <= 1) {
            return n;
        }
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println("fibonaci seris upto 10: ");

        for(int i=0; i<n; i++) {
            System.out.print(f(i) + " ");
        }
    }
}
