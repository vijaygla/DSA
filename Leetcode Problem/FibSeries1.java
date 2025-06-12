import java.util.Scanner;

public class FibSeries1 {

    public static void main(String[] args) {

        // iterative
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till you want the fib series: ");
        int n = sc.nextInt();
        System.out.print(0+ "  ");
        for(int i=0; i<n; i++) {
            int c = a + b;
            System.out.print(c+ "  ");
            a = b;
            b = c;
        }
        sc.close();

    }
}

