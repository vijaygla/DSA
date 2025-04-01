import java.util.*;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of n-----> ");
        int n = sc.nextInt();
        sc.close();

        int count = 0;

        while(n != 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }

        System.out.print("No of 1 in given number when convert to binary-----> "+ count);
    }
}

