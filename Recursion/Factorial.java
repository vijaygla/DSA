public class Factorial {

    public static int f(int n) {
        if(n == 0) {
            return 1;
        }
        return n * f(n-1);
    }

    public static void main(String[] args) {
        int ans = f(5);
        System.err.println("Factorial: " + ans);
    }
}
