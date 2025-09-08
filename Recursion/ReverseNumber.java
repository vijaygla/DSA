public class ReverseNumber {

    // using iteration
    public static int reverseNumber(int n) {
        int rem = 0, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    // using recursion
    public static int reverseNumberRecursive(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        int rem = n % 10;
        return reverseNumberRecursive(n / 10, rev * 10 + rem);
    }

    public static void main(String[] args) {
        int n = 234;
        System.out.println("reverse number using iteration: " + reverseNumber(n));
        System.out.println("reverse number using recursion: " + reverseNumberRecursive(n, 0));
    }
}
