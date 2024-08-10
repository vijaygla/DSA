public class SumOfDigit {
    public static int sumOfDigit(int n){
        // if(n==0){
        //     return 0;
        // }
        // OR  -Select any one of both basde case
        if(n<=9){
            return n;
        }
        return sumOfDigit(n/10) + n%10;
    }
    public static void main(String[] args) {
        int n = 2345 ;
        int result = sumOfDigit(n);
        System.out.println("Sum Of Digit = "+result);
    }
}
