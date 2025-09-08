public class SumOfDigit {

    // method_1
    public static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigit(n / 10);
    }

    // method_2
    public static int sumOfDigit2(int n) {
        if (n <= 9) {
            return n;
        }
        return n % 10 + sumOfDigit2(n / 10);
    }

    public static void main(String[] args) {
        int n = 2345;
        int result = sumOfDigit(n);
        System.out.println("Sum Of Digit = " + result);
        System.err.println("Sum of natural number using method2: " + sumOfDigit2(n));
    }
}
