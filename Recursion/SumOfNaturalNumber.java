public class SumOfNaturalNumber {

    public static int sumOfNaturalNumber(int n)  {
        if(n == 0) {
            return 0;
        }
        return n + sumOfNaturalNumber(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of First n natural number: " + sumOfNaturalNumber(n));
    }
}
